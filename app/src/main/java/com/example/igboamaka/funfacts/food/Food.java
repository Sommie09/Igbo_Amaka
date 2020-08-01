package com.example.igboamaka.funfacts.food;

public class Food {
    private String foodName;
    private int foodImage;
    private String foodDescription;
    private int foodBackground;

    public Food(String foodName, int foodImage, String foodDescription, int foodBackground) {
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodDescription = foodDescription;
        this.foodBackground = foodBackground;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public int getFoodBackground() {
        return foodBackground;
    }
}
