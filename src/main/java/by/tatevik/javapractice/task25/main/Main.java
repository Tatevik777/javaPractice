package by.tatevik.javapractice.task25.main;

import by.tatevik.javapractice.task25.util.email.Letter;
import by.tatevik.javapractice.task25.util.email.LetterManager;

public class Main {

  /*  task22.
    Создать класс LetterManager,  принимающий в свои методы тип интерфейса.
    вариант без интерфейса
    Создать класс Письмо.
    Реализовать с использованием интерфейса возможности:
    Добавить текст письма/ отправить/принять письмо; проверить
    адресат на существование. Реализовать код  так, чтобы из метода
    main можно было вызвать LetterManager, но нельзя было обратиться к
    методам самого класса Письма. Произвести над письмом различные манипуляции
    из метода main.
   */

  public static void main(String[] args) {

    LetterManager letterManager=new LetterManager();
    Letter letter=letterManager.createLetter("активно учу Java");

    letterManager.sendLetter(letter);
    letterManager.receiveLetter(letter);
  }
}
