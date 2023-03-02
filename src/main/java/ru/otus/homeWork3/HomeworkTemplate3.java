package ru.otus.homeWork3;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Заготовка для выполнения ДЗ "Система тестирования".
 */
public class HomeworkTemplate3 {
    public static void main(String[] args) {
        int correctCount = 0;

        String[][] answerOptions = {{"Внимание, вопрос:\nКакова цель метода «public static void main (String [] args)» в Java?", "Варианты ответов:\na) Он объявляет основной метод для приложения Java", "b) Он указывает начальную точку для приложения Java", "c) Он позволяет приложению Java принимать аргументы командной строки", "d) Все вышеперечисленное"}, {"Внимание, вопрос:\nЧто такое наследование в Java?", "a) Механизм создания новых классов из существующих классов", "b) Механизм совместного использования методов и полей между классами ", "c) Механизм повторного использования существующего кода в новых приложениях", "d) Все вышеперечисленное"}, {"Внимание, вопрос:\nЧто такое интерфейс в Java?", "a) Схема классов", "b) Тип, который может содержать методы, поля и внутренние классы", "c) Набор абстрактных методов и константных значений", "d) Набор связанных классов"}};

        String[] correctAnswers = {"d", "a", "c"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < answerOptions.length; i++) {
            String[] entry = answerOptions[i];
            for (String s : entry) {
                System.out.println(s);
            }

            while (scanner.hasNextInt()) {
                System.out.println("некорректный ответ");
                scanner.nextLine();
            }
            String[] arr = {"a", "b", "c", "d",};

            String userAnswer = scanner.nextLine();
            while (!Arrays.asList(arr).contains(userAnswer.toLowerCase())) {
                System.out.println("некорректный ответ");
                userAnswer = scanner.nextLine();
            }

            if (userAnswer.toLowerCase().equals(correctAnswers[i])) {
                correctCount++;
            }

        }
        System.out.println("Верных ответов: " + correctCount + "/" + answerOptions.length);
        System.out.println("Неверных ответов: " + (answerOptions.length - correctCount) + "/" + answerOptions.length);
    }
}

