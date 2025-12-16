package com.wasif.controller;

import com.wasif.model.ProductEntity;
import com.wasif.service.ProductServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    int a =10;

String name = "crudapp";

    private final ProductServiceInterface productService;

    ProductController(ProductServiceInterface productService){
        this.productService = productService;
    }

    @PostMapping("api/saveProduct")
    public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductEntity product){

       return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED) ;
    }


    @GetMapping("api/getProducts")
    public ResponseEntity<List<ProductEntity>> getAll(){
        return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
    }


    @PutMapping("api/update/{id}")
    public ProductEntity updateProduct(@PathVariable Long id , @RequestBody ProductEntity productEntity ){
         return productService.updateProduct(productEntity,id);

    }

    @DeleteMapping("api/delete/{id}")
    public String delete(@PathVariable Long id){
        productService.deleteById(id);
        return "deleted";

    }
}
