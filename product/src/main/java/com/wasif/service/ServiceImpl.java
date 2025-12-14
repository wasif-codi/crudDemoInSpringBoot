package com.wasif.service;

import com.wasif.model.ProductEntity;
import com.wasif.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements ProductServiceInterface {

    private  final ProductRepository productRepository;

    ServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
       return productRepository.save(product);
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        List<ProductEntity>  all = productRepository.findAll();
        return all;
    }

    @Override
    public ProductEntity updateProduct(ProductEntity req, Long id) {
          ProductEntity  product = productRepository.findById(id).get();
          product.setName(req.getName());
          product.setDescription(req.getDescription());

         return productRepository.save(product);



        // if(req.getProduct_id()!= null){
//            productEntity.setName(productEntity.getName());
//            productEntity.setDescription(productEntity.getDescription());
//
//            =productRepository.save(productEntity);

        }

    @Override
    public void deleteById(Long id) {
         productRepository.deleteById(id);

    }
}

