package com.example.igboamaka.funfacts.proverbs;

public class Proverbs {
    private String igboProverb;
    private String englishProverb;
    private int profileBackgroundColour;

    public Proverbs(String igboProverb, String englishProverb, int profileBackgroundColour) {
        this.igboProverb = igboProverb;
        this.englishProverb = englishProverb;
        this.profileBackgroundColour = profileBackgroundColour;
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
}
