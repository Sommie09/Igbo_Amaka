package com.chisom.igboamaka.funfacts.proverbs;

public class Proverbs {
    private final String igboProverb;
    private final String englishProverb;
    private final int profileBackgroundColour;
    private final int audio;

    public Proverbs(String igboProverb, String englishProverb, int profileBackgroundColour, int audio) {
        this.igboProverb = igboProverb;
        this.englishProverb = englishProverb;
        this.profileBackgroundColour = profileBackgroundColour;
        this.audio = audio;
    }

    public String getIgboProverb() {
        return igboProverb;
    }

    public String getEnglishProverb() {
        return englishProverb;
    }

    public int getProfileBackgroundColour() {
        return profileBackgroundColour;
    }

    public int getAudio() {
        return audio;
    }
}
