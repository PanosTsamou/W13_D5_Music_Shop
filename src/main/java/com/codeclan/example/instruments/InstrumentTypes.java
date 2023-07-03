package com.codeclan.example.instruments;

public enum InstrumentTypes {
    KEYBOARD("keyboard"),
    WIND("wind"),
    BRASS("Brass"),
    PERCUSSION("percussion"),
    STRING("string");

    private String name;

    InstrumentTypes(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
