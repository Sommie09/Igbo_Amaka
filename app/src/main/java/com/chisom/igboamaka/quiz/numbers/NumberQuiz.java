package com.chisom.igboamaka.quiz.numbers;

public class NumberQuiz {
    private final String questionCounter;
    private final String question;
    private final int option1Colour;
    private final int option2Colour;
    private final int option3Colour;
    private final int option4Colour;
    private final String option1;
    private final String option2;
    private final String option3;
    private final String option4;

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

}
