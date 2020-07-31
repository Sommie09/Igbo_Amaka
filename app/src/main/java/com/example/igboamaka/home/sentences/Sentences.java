package com.example.igboamaka.home.sentences;

public class Sentences {
    public String igboSentence;
    public String englishSentence;
    public int profileBackgroundColour;

    public Sentences(String englishSentence, String igboSentence, int profileBackgroundColour) {
        this.igboSentence = igboSentence;
        this.englishSentence = englishSentence;
        this.profileBackgroundColour = profileBackgroundColour;
    }

    public String getIgboSentence() {
        return igboSentence;
    }

    public String getEnglishSentence() {
        return englishSentence;
    }

    public int getProfileBackgroundColour() {
        return profileBackgroundColour;
    }
}
