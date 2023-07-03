package com.codeclan.example.instruments;

public class Piano extends Instruments{
    private int numberOfKeys;
    private  String typeOfPiano;
    private boolean containsStand;

    public Piano(double sellingPrice, double buyingPrice, String brand, int year, String material,
                 InstrumentTypes type, String colour, int numberOfKeys,
                     String typeOfPiano, boolean containsStand) {
        super(sellingPrice, buyingPrice, brand, year, material, type, colour);
        this.numberOfKeys = numberOfKeys;
        this.typeOfPiano = typeOfPiano;
        this.containsStand = containsStand;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getTypeOfPiano() {
        return typeOfPiano;
    }

    public boolean isContainsStand() {
        return containsStand;
    }

    @Override
    public String play() {
        return "turu ru";
    }
}
