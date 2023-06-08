package com.example.springBoot.service;



import com.example.springBoot.entity.ProductEntity;
import com.example.springBoot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Page<ProductEntity> getAllProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Page<ProductEntity> getProductsByName(String searchInput, Pageable pageable) {
        return productRepository.getByNameContaining(searchInput,pageable);
    }
}
