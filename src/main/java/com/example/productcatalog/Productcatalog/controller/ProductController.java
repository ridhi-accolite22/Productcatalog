package com.example.productcatalog.Productcatalog.controller;

import com.example.productcatalog.Productcatalog.model.Product;
import com.example.productcatalog.Productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    private ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok().body(this.productService.getProduct());
    }
    @GetMapping("/product/{prodId}")
    private Product getAllProductId(@PathVariable long prodId){
        return (this.productService.getProdByID(prodId));
    }
    @PostMapping("/product")
    private ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(this.productService.createProd(product));
    }
    @PutMapping("/product/{prodId}")
    private ResponseEntity<Product> updateProduct(@PathVariable long prodId,@RequestBody Product product){
        product.setProdID(prodId);
        return ResponseEntity.ok().body(this.productService.updateProd(product));
    }
    @DeleteMapping("/product")
    private HttpStatus deleteProduct(@PathVariable long prodId){
        this.productService.deleteProd(prodId);
        return HttpStatus.OK;
    }
}
