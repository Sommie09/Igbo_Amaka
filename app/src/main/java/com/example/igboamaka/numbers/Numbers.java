package com.example.igboamaka.numbers;

public class Numbers {
    private String englishDigit;
    private String igboTranslation;
    private int audioResource;

    public Numbers(String englishDigit, String igboTranslation) {
        this.englishDigit = englishDigit;
        this.igboTranslation = igboTranslation;
    }

    public Numbers(){}

    public String getEnglishDigit() {
        return englishDigit;
    }

    public String getIgboTranslation() {
        return igboTranslation;
    }

    public int getAudioResource() {
        return audioResource;
    }
}
