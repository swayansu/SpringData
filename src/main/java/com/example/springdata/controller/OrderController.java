package com.example.springdata.controller;


import com.example.springdata.dto.OrderRequest;
import com.example.springdata.dto.OrderResponse;
import com.example.springdata.entity.Customer;
import com.example.springdata.entity.Product;
import com.example.springdata.repository.CustomerRepo;
import com.example.springdata.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/placeorder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){
        return customerRepo.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepo.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInfo(){
        return productRepo.getJoinInfo();
    }
}
