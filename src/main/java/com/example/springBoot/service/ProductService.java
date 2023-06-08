package com.example.springBoot.service;

import antlr.collections.List;
import com.example.springBoot.entity.ProductEntity;
import com.example.springBoot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public ArrayList getAllProduct(){
        return (ArrayList) productRepository.findAll();
    }
}
