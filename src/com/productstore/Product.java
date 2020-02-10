/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.productstore;

import java.time.LocalDate;

/**
 *
 * @author Vladik_tm
 */
public class Product {

    private String name,description;
    private int firstPrice,price;
    private LocalDate date;
    
    public Product(String name, String desc, int firstPrice, int price, LocalDate date) {
        this.name = name;
        this.description = desc;
        this.firstPrice = firstPrice;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return String.format("--------\nProduct: %s\nFirstPrice: %d\nPrice: %d\nDescription: %s\nDeadline: %s\n--------"
        , name, firstPrice, price, description, date);
    }
    
   
   
    
}
