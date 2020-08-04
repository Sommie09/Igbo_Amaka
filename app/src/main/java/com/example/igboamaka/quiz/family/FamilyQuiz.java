package com.example.igboamaka.quiz.family;

public class FamilyQuiz {

    private String questionCounter;
    private String question;
    private int option1Colour, option2Colour, option3Colour, option4Colour;
    private String option1, option2, option3, option4;
    private int familyImage1, familyImage2, familyImage3, familyImage4 ;

    public FamilyQuiz(String questionCounter, String question, int option1Colour, int option2Colour, int option3Colour, int option4Colour, String option1, String option2, String option3, String option4, int familyImage1, int familyImage2, int familyImage3, int familyImage4) {
        this.questionCounter = questionCounter;
        this.question = question;
        this.option1Colour = option1Colour;
        this.option2Colour = option2Colour;
        this.option3Colour = option3Colour;
        this.option4Colour = option4Colour;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.familyImage1 = familyImage1;
        this.familyImage2 = familyImage2;
        this.familyImage3 = familyImage3;
        this.familyImage4 = familyImage4;
    }

    public String getQuestionCounter() {
        return questionCounter;
    }

    public String getQuestion() {
        return question;
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

    public int getFamilyImage1() {
        return familyImage1;
    }

    public int getFamilyImage2() {
        return familyImage2;
    }

    public int getFamilyImage3() {
        return familyImage3;
    }

    public int getFamilyImage4() {
        return familyImage4;
    }
}
