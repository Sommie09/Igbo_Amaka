package com.example.igboamaka.home.sentences;

public class Sentences {
    private String igboSentence;
    private String englishSentence;
    private int profileBackgroundColour;
    private int audio;

    public Sentences(String igboSentence, String englishSentence, int profileBackgroundColour, int audio) {
        this.igboSentence = igboSentence;
        this.englishSentence = englishSentence;
        this.profileBackgroundColour = profileBackgroundColour;
        this.audio = audio;
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

    public int getAudio() {
        return audio;
    }
}
