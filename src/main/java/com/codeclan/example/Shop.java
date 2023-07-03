package com.codeclan.example;

import com.codeclan.example.behaviours.IBuySell;

import java.util.ArrayList;


public class Shop {
    ArrayList<IBuySell> allProducts;

    public Shop(){

    }

    public ArrayList<IBuySell> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(ArrayList<IBuySell> allProducts) {
        this.allProducts = allProducts;
    }
    public void addProduct(IBuySell product){
        allProducts.add(product);
    }
    public IBuySell getProduct(IBuySell product){
        return allProducts.get(allProducts.indexOf(product));
    }
    public IBuySell removeProduct(IBuySell product){
        return allProducts.remove(allProducts.indexOf(product));
    }
    public  double getTotalProfit(){
        double totalProfit = 0;
        for (IBuySell product : allProducts){
            totalProfit += product.getProfit();
        }
        return totalProfit;
    }
}
