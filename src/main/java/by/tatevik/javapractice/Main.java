package by.tatevik.javapractice;

public class Main {
    public static void main(String[] args) {
        task1();

    }
    public static void task1(){
        //Создать метод public static void task1().
        //Внутри него объявить 2 переменных типа int,
        // проинициализировать их прямо в коде. Затем
        // поменять местами значения в переменных без использования
        // литералов, но с использованием дополнительной переменной.
        int num1=20;
        int num2=25;
        int container;
        container=num1;
        num1=num2;
        num2=container;

    }


}
