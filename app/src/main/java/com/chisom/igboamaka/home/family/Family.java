package com.chisom.igboamaka.home.family;

public class Family {

    private final String igboFamily;
    private final String englishFamily;
    private final int familyImage;
    private final int backGroundColour;
    private final int audio;

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
