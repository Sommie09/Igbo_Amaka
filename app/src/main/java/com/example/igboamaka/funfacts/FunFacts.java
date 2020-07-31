package com.example.igboamaka.funfacts;

public class FunFacts {
    private int image;
    private int background;
    private String title;

    public FunFacts(int image, int background, String title) {
        this.image = image;
        this.background = background;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public int getBackground() {
        return background;
    }

    public String getTitle() {
        return title;
    }
}
