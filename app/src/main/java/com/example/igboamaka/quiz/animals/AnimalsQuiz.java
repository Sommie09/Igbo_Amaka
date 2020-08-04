package com.example.igboamaka.quiz.animals;

public class AnimalsQuiz {
    private String questionCounter;
    private int questionImage;
    private int option1Colour, option2Colour, option3Colour, option4Colour;
    private String option1, option2, option3, option4;

    public AnimalsQuiz(String questionCounter, int questionImage, int option1Colour, int option2Colour, int option3Colour, int option4Colour, String option1, String option2, String option3, String option4) {
        this.questionCounter = questionCounter;
        this.questionImage = questionImage;
        this.option1Colour = option1Colour;
        this.option2Colour = option2Colour;
        this.option3Colour = option3Colour;
        this.option4Colour = option4Colour;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public String getQuestionCounter() {
        return questionCounter;
    }

    public int getQuestionImage() {
        return questionImage;
    }

    public int getOption1Colour() {
        return option1Colour;
    }

    public int getOption2Colour() {
        return option2Colour;
    }

    public int getOption3Colour() {
        return option3Colour;
    }

    public int getOption4Colour() {
        return option4Colour;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }
}
