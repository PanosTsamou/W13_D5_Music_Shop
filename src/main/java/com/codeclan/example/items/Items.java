package com.codeclan.example.items;

import com.codeclan.example.behaviours.IBuySell;

public class Items implements IBuySell {

    private double sellingPrice;
    private double buyingPrice;
    private String brand;
    private String description;

    public Items(double sellingPrice, double buyingPrice, String brand, String description){
        this.brand = brand;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.description = description;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public double getProfit() {
        return getSellingPrice() - getBuyingPrice();
    }

    public String getBrand() {
        return brand;
    }
    @Override
    public double getMarkup() {
        return getProfit()/getBuyingPrice();
    }

    @Override
    public String getMarkupAsString() {
        return (getMarkup()*100) + "%";
    }

    public String getDescription() {
        return description;
    }
}
