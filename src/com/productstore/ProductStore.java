
package com.productstore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vladik_tm
 */
public class ProductStore {
    
    private ArrayList<Product> products;
    private Map<String, Integer> productsIncome;
    private int income = 0, costs = 0;
    
    public ProductStore(int count) {  
        products = new ArrayList<Product>(count);
        productsIncome = new HashMap<>();
    }
    public ProductStore() {  
        products = new ArrayList<Product>(); 
        productsIncome = new HashMap<>();
    }
     
     
    public void addProduct(String name, String desc, int firstPrice, int price, LocalDate date) {
        Product obj = new Product(name, desc, firstPrice, price, date);      
        this.costs += firstPrice;          
        products.add(obj);                  
    }
    
    public void printAllProducts() {
        for(Product obj: products){
            System.out.println(obj);
        }
    }
    
    public void printAllSortName(){
        products.sort((Product a, Product b) -> {
          return a.getName().compareTo(b.getName());
        });
        
        this.printAllProducts();      
    }
    
    public void toSell(int count, String nameProduct) {
        int i = 0;
        int priceOneProduct = 0;
         ArrayList<Product> productsCopy = new ArrayList<Product>(products);
        for(Product obj: productsCopy){
            if(obj.getName().equalsIgnoreCase(nameProduct)){
                income += obj.getPrice();
                priceOneProduct += obj.getPrice();                                          
                products.remove(obj);
                ++i;
            }
            if(i == count) {
                break;
            }
        } 
        
        if (productsIncome.containsKey(nameProduct)) {
            int price = productsIncome.get(nameProduct) + priceOneProduct;
            productsIncome.put(nameProduct, price);
        }
        else {
            productsIncome.put(nameProduct, priceOneProduct);
        }
    }
    
    public void printIncome() {
        System.out.println("Общий доход: " + this.income);
    }
    public void printIncome(String nameProduct) {
        int sale = 0;
        if(productsIncome.get(nameProduct) != null) {
          sale = productsIncome.get(nameProduct);
        }     
        System.out.println(String.format("Доход по продукту %s: %d",nameProduct,sale));
    }
    
    
    
    
    
    
    
}
