package com.example.springBoot.repository;



import com.example.springBoot.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Integer> {
    Page<ProductEntity> getByNameContaining(String searchInput, Pageable pageable);
    Page<ProductEntity> findAll(Pageable pageable);

}
