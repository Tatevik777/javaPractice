package by.tatevik.javapractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr2=new int[]{11,12,13,14,15,16,17,18};
        printRevertArr(arr2);
        //int[] arr=new int[27];
       // task2(arr);
       // System.out.println(Arrays.toString(arr));
    }
    //вывести элементы массива в обратном порядке на экран
    public static void printRevertArr(int[]arr){
        int index=arr.length-1;
        while(index>=0){
            System.out.print(arr[index]+ " ");
            index=index-1;
        }
    }
    //заполнить массив  первыми 25 натуральными числами(1,2,3,4.....)
    //затем добавить в него 100, 200
    public static void task2(int[]arr){
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
    //Создать метод public static void task1().
    //Внутри него объявить 2 переменных типа int,
    // проинициализировать их прямо в коде. Затем
    // поменять местами значения в переменных без использования
    // литералов, но с использованием дополнительной переменной.
    public static void task(){
        int num1=20;
        int num2=25;
        int container;
        container=num1;
        num1=num2;
        num2=container;
    }

}
