package com.codeclan.example.instruments;

import com.apple.eawt.AppEvent;

public class Saxaphone extends Instruments{
    private boolean adjustable;
    private  boolean strap;


    public Saxaphone(double sellingPrice, double buyingPrice, String brand, int year, String material,
                     InstrumentTypes type, String colour,
                     boolean adjustable, boolean strap) {
        super(sellingPrice, buyingPrice, brand, year, material, type, colour);
        this.strap = strap;
        this.adjustable = adjustable;
    }

    public boolean isAdjustable() {
        return adjustable;
    }

    public boolean isStrap() {
        return strap;
    }

    @Override
    public String play() {
        return "pu puuu pu";
    }
}
