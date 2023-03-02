package ru.otus.homeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class Answer {

    public String[] correctAnswer = {"d", "a", "c"};
    public boolean checkAnswer(int i){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            System.out.println("некорректный ответ");
            scanner.nextLine();
        }

        String userAnswer = scanner.nextLine();
        Answer answer = new Answer();
        while (!Arrays.asList(answer.correctAnswer).contains(userAnswer.toLowerCase())) {
            System.out.println("некорректный ответ");
            userAnswer = scanner.nextLine();
        }
        return userAnswer.equalsIgnoreCase(correctAnswer[i]);



    }

}
