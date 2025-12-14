package com.wasif.service;

import com.wasif.model.ProductEntity;

import java.util.List;

public interface ProductServiceInterface {
    ProductEntity saveProduct(ProductEntity product);

    List<ProductEntity> getAllProduct();

    ProductEntity updateProduct( ProductEntity req, Long id);
    void deleteById(Long id);
}
