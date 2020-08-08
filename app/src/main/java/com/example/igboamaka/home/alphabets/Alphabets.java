package com.example.igboamaka.home.alphabets;

public class Alphabets {
    private final String igboTranslation;
    private final int backGroundColour;
    private final int audio;

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
