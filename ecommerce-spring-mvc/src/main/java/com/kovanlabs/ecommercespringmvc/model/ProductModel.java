package com.kovanlabs.ecommercespringmvc.model;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;
    String category;
    double amount;
    public ProductModel(){

    }
    public ProductModel(long id, String name,String category, double amount){
        this.id=id;
        this.name=name;
        this.category=category;
        this.amount=amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
