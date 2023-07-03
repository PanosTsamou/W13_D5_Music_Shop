package com.codeclan.example.items;

public class DrumSticks extends Items{

    private String material;
    private int numberOfSticks;

    public DrumSticks(double sellingPrice, double buyingPrice, String brand, String material, String description,
                      int numberOfSticks) {
        super(sellingPrice, buyingPrice, brand, description);
        this.material = material;
        this.numberOfSticks = numberOfSticks;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumberOfSticks() {
        return numberOfSticks;
    }
}
