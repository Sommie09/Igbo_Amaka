package com.example.igboamaka.home.bodyparts;

public class BodyParts {
    private final String englishPart;
    private final String igboPart;
    private final int colour;
    private final int audio;

    public BodyParts(String englishPart, String igboPart, int colour, int audio) {
        this.englishPart = englishPart;
        this.igboPart = igboPart;
        this.colour = colour;
        this.audio = audio;
    }

    public String getEnglishPart() {
        return englishPart;
    }

    public String getIgboPart() {
        return igboPart;
    }

    public int getColour() {
        return colour;
    }

    public int getAudio() {
        return audio;
    }
}
