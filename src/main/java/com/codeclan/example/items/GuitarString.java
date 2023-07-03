package com.codeclan.example.items;

public class GuitarString extends Items{

    private float distanceInMeters;
    private String material;

    public GuitarString(double sellingPrice, double buyingPrice, String brand, String description
            , float distanceInMeters, String material) {
        super(sellingPrice, buyingPrice, brand, description);
        this.distanceInMeters = distanceInMeters;
        this.material = material;
    }

    public float getDistanceInMeters() {
        return distanceInMeters;
    }

    public String getMaterial() {
        return material;
    }
}
