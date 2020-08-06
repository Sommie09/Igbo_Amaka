package com.example.igboamaka.home.colors;

public class Colours {
    private String englishTranslation;
    private String igboTranslation;
    private int backGroundColour;
    private int textColour;
    private int audio;


    public Colours(String englishTranslation, String igboTranslation, int backGroundColour, int textColour, int audio) {
        this.englishTranslation = englishTranslation;
        this.igboTranslation = igboTranslation;
        this.backGroundColour = backGroundColour;
        this.textColour = textColour;
        this.audio = audio;
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

    public int getAudio() { return audio; }
}
