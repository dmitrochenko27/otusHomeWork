package ru.otus.homeWork4;

public class Question {
    private final String[] testQuestion;

    public Question(String[] testQuestion) {
        this.testQuestion = testQuestion;
    }

    public void printQuestion() {
        for (int i = 0; i < testQuestion.length; i++) {
            System.out.println(testQuestion[i]);

        }

    }


}
