package ru.otus.homeWork4;

public class HomeworkTemplate4 {
    static int i = 0;
   static int correctAnswer = 0;
   static int wrongAnswer = 0;
    public static void main(String[] args) {
        Answer answer = new Answer();
        Question question = new Question(new String[]{"Внимание, вопрос:\n " +
               "Какова цель метода «public static void main (String [] args)» в Java?", "Варианты ответов:\n " +
                "a) Он объявляет основной метод для приложения Java",
               "b) Он указывает начальную точку для приложения Java",
               "c) Он позволяет приложению Java принимать аргументы командной строки",
               "d) Все вышеперечисленное"});
       question.printQuestion();
      if (answer.checkAnswer(i)){
          correctAnswer++;
      }
      else {
          wrongAnswer++;
      }
       i++;
         question = new Question(new String[]{"Внимание, вопрос:\nЧто такое наследование в Java?",
                "a) Механизм создания новых классов из существующих классов",
                "b) Механизм совместного использования методов и полей между классами ",
                "c) Механизм повторного использования существующего кода в новых приложениях",
                "d) Все вышеперечисленное"});
        question.printQuestion();
        if (answer.checkAnswer(i)){
            correctAnswer++;
        }
        else {
            wrongAnswer++;
        }
        i++;
        question = new Question(new String[]{"Внимание, вопрос:\nЧто такое интерфейс в Java?",
                "a) Схема классов",
                "b) Тип, который может содержать методы, поля и внутренние классы",
                "c) Набор абстрактных методов и константных значений",
                "d) Набор связанных классов"});
        question.printQuestion();
        if (answer.checkAnswer(i)){
            correctAnswer++;
        }
        else {
            wrongAnswer++;
        }
        i++;
        System.out.println("Верных ответов: " + correctAnswer );
        System.out.println("Неверных ответов: " + wrongAnswer);


    }


}
