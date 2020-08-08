package com.chisom.igboamaka.home.household;

public class HouseHold {
    private final String englishItem;
    private final String igboItem;
    private final int colour;
    private final int audio;

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
