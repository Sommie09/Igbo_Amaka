package com.example.igboamaka.home.family;

public class Family {

    private String igboFamily;
    private String englishFamily;
    private int familyImage;
    private int backGroundColour;
    private int audio;

    public Family(String igboFamily, String englishFamily, int familyImage, int backGroundColour, int audio) {
        this.igboFamily = igboFamily;
        this.englishFamily = englishFamily;
        this.familyImage = familyImage;
        this.backGroundColour = backGroundColour;
        this.audio = audio;
    }

    public String getIgboFamily() {
        return igboFamily;
    }

    public String getEnglishFamily() {
        return englishFamily;
    }

    public int getFamilyImage() {
        return familyImage;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }

    public int getAudio() {
        return audio;
    }
}
