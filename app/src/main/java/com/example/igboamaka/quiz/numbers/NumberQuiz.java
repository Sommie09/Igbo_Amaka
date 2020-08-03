package com.example.igboamaka.quiz.numbers;

public class NumberQuiz {
    private String questionCounter;
    private String question;
    private int option1Colour, option2Colour, option3Colour, option4Colour;
    private String option1, option2, option3, option4;

    public NumberQuiz(String questionCounter, String question, int option1Colour, int option2Colour, int option3Colour, int option4Colour, String option1, String option2, String option3, String option4) {
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
    }

    public String getQuestionCounter() {
        return questionCounter;
    }

    public void setQuestionCounter(String questionCounter) {
        this.questionCounter = questionCounter;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getOption1Colour() {
        return option1Colour;
    }

    public void setOption1Colour(int option1Colour) {
        this.option1Colour = option1Colour;
    }

    public int getOption2Colour() {
        return option2Colour;
    }

    public void setOption2Colour(int option2Colour) {
        this.option2Colour = option2Colour;
    }

    public int getOption3Colour() {
        return option3Colour;
    }

    public void setOption3Colour(int option3Colour) {
        this.option3Colour = option3Colour;
    }

    public int getOption4Colour() {
        return option4Colour;
    }

    public void setOption4Colour(int option4Colour) {
        this.option4Colour = option4Colour;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }
}
