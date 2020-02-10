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
public class App {
    public static void main(String[] args) {
       
        ProductStore productStore = new ProductStore(50);
        
        for (int i = 1; i < 10; i++) {
            LocalDate date = LocalDate.now();
            date.plusDays(i);
           productStore.addProduct("Product " + i, "desc " + i,100 + i , 100 + 5 + i, date);
        }
        
        productStore.printAllProducts();
        
        productStore.toSell(1, "Product 1");
        productStore.toSell(1, "Product 2");
      
        productStore.printIncome();
        
        productStore.printIncome("Product 2");
        
        
        
        
//        productStore.printAllSortName();
        
        
        
        
        
    }
    
}
