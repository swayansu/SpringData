package com.example.springdata.repository;

import com.example.springdata.dto.OrderResponse;
import com.example.springdata.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer > {

    @Query("SELECT new com.example.springdata.dto.OrderResponse(c.name, p.productName) from Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInfo();
}
