package com.chisom.igboamaka.home.numbers;

@SuppressWarnings("ALL")
public class Numbers {
    private final String englishDigit;
    private final String igboTranslation;
    private final int backGroundColour;
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
