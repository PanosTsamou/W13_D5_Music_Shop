package com.codeclan.example.items;

public class MusicSheets extends Items{
    private int numberOfSheets;

    public MusicSheets(double sellingPrice, double buyingPrice, String brand, String description, int numberOfSheets) {
        super(sellingPrice, buyingPrice, brand, description);
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }
}
