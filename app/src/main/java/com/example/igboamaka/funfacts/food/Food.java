package com.example.igboamaka.funfacts.food;

public class Food {
    private String foodName;
    private int foodImage;
    private int foodBackground;

    public Food(String foodName, int foodImage, int foodBackground) {
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodBackground = foodBackground;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public int getFoodBackground() {
        return foodBackground;
    }
}
