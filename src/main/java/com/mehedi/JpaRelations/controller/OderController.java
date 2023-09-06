package com.mehedi.JpaRelations.controller;


import com.mehedi.JpaRelations.dto.OrderRequest;
import com.mehedi.JpaRelations.entity.Customer;
import com.mehedi.JpaRelations.entity.JoinResponse;
import com.mehedi.JpaRelations.repository.CustomerRepo;
import com.mehedi.JpaRelations.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OderController {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;


    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return customerRepo.save(request.getCustomer());

    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllCustomer() {
        return customerRepo.findAll();
    }

    @GetMapping("/findJoinInfo")
    public List<JoinResponse> findJoinInfo() {
        return customerRepo.getJoinInfo();
    }


}
