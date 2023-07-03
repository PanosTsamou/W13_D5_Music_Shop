package com.codeclan.example.instruments;

import com.codeclan.example.behaviours.IBuySell;
import com.codeclan.example.behaviours.IPlay;

import java.text.DecimalFormat;

public abstract class Instruments implements IPlay, IBuySell {
    private double sellingPrice;
    private double buyingPrice;
    private String brand;
    private InstrumentTypes type;
    private String colour;
    private String material;
    private int year;

    public Instruments(double sellingPrice, double buyingPrice, String brand, int year, String material,
                       InstrumentTypes type, String colour){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.brand = brand;
        this.year = year;
        this.type = type;
        this.colour = colour;
        this.material = material;
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

    @Override
    public double getMarkup() {
        return getProfit()/getBuyingPrice();
    }

    @Override
    public String getMarkupAsString() {
        DecimalFormat decFormat = new DecimalFormat("#.##");
        return decFormat.format(getMarkup()*100) + "%";
    }

    public String getBrand() {
        return brand;
    }


    public int getYear() {
        return year;
    }

    public String getType() {
        return type.getName();
    }


    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public abstract String play();
}
