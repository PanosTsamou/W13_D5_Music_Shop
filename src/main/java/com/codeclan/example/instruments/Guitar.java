package com.codeclan.example.instruments;

public class Guitar extends Instruments{
    private  int numberOfStrings;
    private String typeOfGuitar;
    private boolean containsKey;


    public Guitar(double sellingPrice, double buyingPrice, String brand, int year, String material,
                  InstrumentTypes type, String colour, int numberOfStrings,
                  String typeOfGuitar, boolean containsKey) {
        super(sellingPrice, buyingPrice, brand, year, material, type, colour);
        this.numberOfStrings = numberOfStrings;
        this.typeOfGuitar = typeOfGuitar;
        this.containsKey = containsKey;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getTypeOfGuitar() {
        return typeOfGuitar;
    }

    public boolean isContainsKey() {
        return containsKey;
    }

    @Override
    public String play() {
        return "drin drin";
    }
}
