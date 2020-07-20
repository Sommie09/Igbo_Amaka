package com.example.igboamaka.alphabets;

public class Alphabets {
    private String igboTranslation;
    private int backGroundColour;
    private int audioResource;

    public Alphabets(String igboTranslation, int backGroundColour) {
        this.igboTranslation = igboTranslation;
        this.backGroundColour = backGroundColour;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }

    public String getIgboTranslation() {
        return igboTranslation;
    }
}
