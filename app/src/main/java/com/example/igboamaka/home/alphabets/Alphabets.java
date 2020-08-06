package com.example.igboamaka.home.alphabets;

public class Alphabets {
    private String igboTranslation;
    private int backGroundColour;
    private int audio;

    public Alphabets(String igboTranslation, int backGroundColour, int audio) {
        this.igboTranslation = igboTranslation;
        this.backGroundColour = backGroundColour;
        this.audio = audio;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }

    public String getIgboTranslation() {
        return igboTranslation;
    }

    public int getAudio() { return audio; }
}
