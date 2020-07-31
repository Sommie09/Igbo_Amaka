package com.example.igboamaka.home.household;

public class HouseHold {
    private String englishItem;
    private String igboItem;
    private int colour;

    public HouseHold(String englishItem, String igboItem, int colour) {
        this.englishItem = englishItem;
        this.igboItem = igboItem;
        this.colour = colour;
    }

    public String getEnglishItem() {
        return englishItem;
    }

    public String getIgboItem() {
        return igboItem;
    }

    public int getColour() {
        return colour;
    }
}
