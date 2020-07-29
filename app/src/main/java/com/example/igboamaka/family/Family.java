package com.example.igboamaka.family
        ;

public class Family {
    private String familyIgbo;
    private String familyEnglish;
    private int familyImage;
    private int backGroundColour;

    public Family(String familyIgbo, String familyEnglish, int familyImage, int backGroundColour) {
        this.familyIgbo = familyIgbo;
        this.familyEnglish = familyEnglish;
        this.familyImage = familyImage;
        this.backGroundColour = backGroundColour;
    }

    public String getFamilyIgbo() {
        return familyIgbo;
    }

    public String getFamilyEnglish() {
        return familyEnglish;
    }

    public int getFamilyImage() {
        return familyImage;
    }

    public int getBackGroundColour() {
        return backGroundColour;
    }
}

