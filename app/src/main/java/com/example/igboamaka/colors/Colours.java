package com.example.igboamaka.colors;

public class Colours {
    private String englishTranslation;
    private String igboTranslation;
    private int backGroundColour;
    private int textColour;
    private int audioResource;


    public Colours(String englishTranslation, String igboTranslation, int backGroundColour, int textColour) {
        this.englishTranslation = englishTranslation;
        this.igboTranslation = igboTranslation;
        this.backGroundColour = backGroundColour;
        this.textColour = textColour;
    }

    public int getTextColour() {
        return textColour;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public String getIgboTranslation() {
        return igboTranslation;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }
}
