package com.example.springdata.dto;


import com.example.springdata.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRequest {

    private Customer customer;
}
