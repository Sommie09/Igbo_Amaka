package com.example.igboamaka.funfacts.dressing;

public class Dressing {
    private int dressing_image;
    private String dressing_type;
    private String dressing_description;

    public Dressing(int dressing_image, String dressing_type, String dressing_description) {
        this.dressing_image = dressing_image;
        this.dressing_type = dressing_type;
        this.dressing_description = dressing_description;
    }

    public int getDressing_image() {
        return dressing_image;
    }

    public String getDressing_type() {
        return dressing_type;
    }

    public String getDressing_description() {
        return dressing_description;
    }
}
