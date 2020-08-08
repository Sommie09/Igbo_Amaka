package com.chisom.igboamaka.funfacts.food;

public class Food {
    private final String foodName;
    private final int foodImage;
    private final int foodBackground;

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
