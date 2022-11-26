package com.example.productcatalog.Productcatalog.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long prodID;

    @Column(name="prodName")
    private String prodName;

    @Column(name="prodCount")
    private int prodCount;

   // @Column(name="price")
   // private int price;

    @CreationTimestamp
    private Date createdTime;

    public long getProdID() {
        return prodID;
    }

    public void setProdID(long prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdCount() {
        return prodCount;
    }

    public void setProdCount(int prodCount) {
        this.prodCount = prodCount;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }*/
}
