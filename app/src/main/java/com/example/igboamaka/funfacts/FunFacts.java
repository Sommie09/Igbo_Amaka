package com.example.igboamaka.funfacts;

public class FunFacts {
    private int image;
    private String description;
    private String title;

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
