package com.example.springBoot.controller;

import com.example.springBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HelloController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/")
    public String showHello(Model model){

        ArrayList list = productService.getAllProduct();
        model.addAttribute("productList", list);
        return "index2";
    }
}
