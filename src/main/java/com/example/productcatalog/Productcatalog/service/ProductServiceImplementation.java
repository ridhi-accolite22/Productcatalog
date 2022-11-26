package com.example.productcatalog.Productcatalog.service;

import com.example.productcatalog.Productcatalog.model.Product;
import com.example.productcatalog.Productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImplementation implements ProductService{
    @Autowired
    private ProductRepository prodrepository;

    @Override
    public Product createProd(Product p) {
        return prodrepository.save(p);
    }



    @Override
    public Product updateProd(Product p) {
        Optional<Product> prodObj=this.prodrepository.findById(p.getProdID());
        if(prodObj.isPresent()){
            Product prodUpdate=prodObj.get();
            prodUpdate.setProdID(p.getProdID());
            prodUpdate.setProdCount(p.getProdCount());
            prodUpdate.setProdName(p.getProdName());




        return this.prodrepository.save(prodUpdate);
    }
        else
            System.out.println("product not found"+p.getProdID());
        return null;
    }



    @Override
    public List<Product> getProduct() {
        return this.prodrepository.findAll();
    }

    @Override
    public Product getProdByID(long prodId) {
        Optional<Product> prodObj=this.prodrepository.findById(prodId);
        if(prodObj.isPresent())
            return prodObj.get();
        else
        {
            System.out.println(("not found"));
            return null;
        }
    }

    @Override
    public void deleteProd(long prodId) {
        Optional<Product> prodObj=this.prodrepository.findById(prodId);
        if(prodObj.isPresent()){
            this.prodrepository.deleteById(prodId);

        }
        else{
            System.out.println("not found");

        }
    }
}
