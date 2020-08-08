package com.example.igboamaka.home.animals;

public class Animals {
    private final String igboAnimal;
    private final String englishAnimal;
    private final int animalImage;
    private final int backGroundColour;
    private final int audio;

    public Animals(String englishAnimal, String igboAnimal, int animalImage, int backGroundColour, int audio) {
        this.igboAnimal = igboAnimal;
        this.englishAnimal = englishAnimal;
        this.animalImage = animalImage;
        this.backGroundColour = backGroundColour;
        this.audio = audio;
    }

    public String getIgboAnimal() {
        return igboAnimal;
    }

    public String getEnglishAnimal() {
        return englishAnimal;
    }

    public int getAnimalImage() {
        return animalImage;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }

    public int getAudio() { return audio; }
}
