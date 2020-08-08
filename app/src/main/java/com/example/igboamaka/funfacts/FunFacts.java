package com.example.igboamaka.funfacts;

public class FunFacts {
    private final int image;
    private final String description;
    private final String title;

    public FunFacts(String description, int image, String title) {
        this.image = image;
        this.description = description;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
