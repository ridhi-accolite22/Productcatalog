package com.example.productcatalog.Productcatalog.service;

import com.example.productcatalog.Productcatalog.model.Product;

import java.util.List;

public interface ProductService {
    Product createProd(Product p);
    Product updateProd(Product p);


    //Product getPrice(Product p);
    List<Product> getProduct();
    Product getProdByID(long prodId);
    void deleteProd(long prodId);
}
