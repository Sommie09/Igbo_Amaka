package com.example.igboamaka.home.household;

public class HouseHold {
    private String englishItem;
    private String igboItem;
    private int colour;
    private int audio;

    public HouseHold(String englishItem, String igboItem, int colour, int audio) {
        this.englishItem = englishItem;
        this.igboItem = igboItem;
        this.colour = colour;
        this.audio = audio;
    }

    public String getEnglishItem() {
        return englishItem;
    }

    public String getIgboItem() {
        return igboItem;
    }

    public int getColour() {
        return colour;
    }

    public int getAudio() {
        return audio;
    }
}
