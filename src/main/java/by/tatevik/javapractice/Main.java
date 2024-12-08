package by.tatevik.javapractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        int[] arr=new int[27];
        task2(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void task1(){


    }
    public static void task2(int[]arr){
        //заполнить массив  первыми 25 натуральными числами(1,2,3,4.....)
        //затем добавить в него 100, 200
        int index=0;
        int num=1;
        while(index<=24){
            arr[index]=num;
            index=index+1;
            num=num+1;
        }
        arr[25]=100;
        arr[26]=200;
    }

    public static void task(){
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
