package com.example.springBoot.controller;

import com.example.springBoot.entity.ProductEntity;
import com.example.springBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/index")
    public String showHello(Model model){
        return "index";
    }
    @GetMapping(value={"/", "/search"})
    public String showProducts(Model model, @RequestParam(name="searchInput", required=false, defaultValue="") String searchInput,
                               @RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "2") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<ProductEntity> searchList;
        if (searchInput.isEmpty()) {
            searchList = (Page<ProductEntity>) productService.getAllProduct(pageable);
        } else {
            searchList = productService.getProductsByName(searchInput, pageable);
        }
        model.addAttribute("productList", searchList);
        model.addAttribute("searchInput", searchInput);
        return "product";
    }
}
