package com.example.igboamaka.numbers;

public class Numbers {
    private String englishDigit;
    private String igboTranslation;
    private int backGroundColour;
    private int audioResource;


    public Numbers(String englishDigit, String igboTranslation, int backGroundColour) {
        this.englishDigit = englishDigit;
        this.igboTranslation = igboTranslation;
        this.backGroundColour = backGroundColour;
    }

    public Numbers(){}

    public String getEnglishDigit() {
        return englishDigit;
    }

    public String getIgboTranslation() {
        return igboTranslation;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }

    public int getAudioResource() {
        return audioResource;
    }
}
