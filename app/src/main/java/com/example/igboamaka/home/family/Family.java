package com.example.igboamaka.home.family
        ;

public class Family {
    private String familyIgbo;
    private String familyEnglish;
    private int familyImage;
    private int backGroundColour;
    private int audio;

    public Family(String familyIgbo, String familyEnglish, int familyImage, int backGroundColour, int audio) {
        this.familyIgbo = familyIgbo;
        this.familyEnglish = familyEnglish;
        this.familyImage = familyImage;
        this.backGroundColour = backGroundColour;
        this.audio = audio;
    }

    public String getFamilyIgbo() {
        return familyIgbo;
    }

    public String getFamilyEnglish() {
        return familyEnglish;
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

