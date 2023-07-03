package com.codeclan.example.instruments;

public class DrumKits extends Instruments{

    private boolean drumSticks;
    private int numberOfRackTom;
    private int numberOfSnareDrums;
    public DrumKits(double sellingPrice, double buyingPrice, String brand, int year, String material,
                    InstrumentTypes type, String colour, boolean drumSticks, int numberOfRackTom, int numberOfSnareDrums) {
        super(sellingPrice, buyingPrice, brand, year, material, type, colour);
        this.drumSticks = drumSticks;
        this.numberOfRackTom = numberOfRackTom;
        this.numberOfSnareDrums = numberOfSnareDrums;
    }

    public boolean isDrumSticks() {
        return drumSticks;
    }

    public int getNumberOfRackTom() {
        return numberOfRackTom;
    }

    public int getNumberOfSnareDrums() {
        return numberOfSnareDrums;
    }

    @Override
    public String play() {
        return "tiki tass, tiki tass";
    }
}
