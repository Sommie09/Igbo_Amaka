package com.example.igboamaka.home.numbers;

public class Numbers {
    private String englishDigit;
    private String igboTranslation;
    private int backGroundColour;
    private int audio;


    public Numbers(String englishDigit, String igboTranslation, int backGroundColour, int audio) {
        this.englishDigit = englishDigit;
        this.igboTranslation = igboTranslation;
        this.backGroundColour = backGroundColour;
        this.audio = audio;
    }

    public Numbers(String englishDigit, String igboTranslation, int backGroundColour) {
        this.englishDigit = englishDigit;
        this.igboTranslation = igboTranslation;
        this.backGroundColour = backGroundColour;
    }

    public String getEnglishDigit() {
        return englishDigit;
    }

    public String getIgboTranslation() {
        return igboTranslation;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }

    public int getAudio() {
        return audio;
    }
}
