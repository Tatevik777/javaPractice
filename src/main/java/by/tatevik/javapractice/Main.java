package by.tatevik.javapractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
       // int[] arr2=new int[]{11,12,13,14,15,16,17,18};
       // printRevertArr(arr2);

        
        //int[] arr=new int[27];
       // task2(arr);
       // System.out.println(Arrays.toString(arr));

        //task4
        //int maxN=5;
        //long[]arr3=new long[5];
        //task4(arr3,maxN);
       // System.out.println(Arrays.toString(arr3));

    }
    //1. вывести элементы массива в обратном порядке на экран
    public static void printRevertArr(int[]arr){
        int index=arr.length-1;
        while(index>=0){
            System.out.print(arr[index]+ " ");
            index=index-1;
        }
    }
    //2. заполнить массив  первыми 25 натуральными числами(1,2,3,4.....)
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
    //3.Создать метод public static void task3().
    //Внутри него объявить 2 переменных типа int,
    // проинициализировать их прямо в коде. Затем
    // поменять местами значения в переменных без использования
    // литералов, но с использованием дополнительной переменной.
    public static void task3(){
        int num1=20;
        int num2=25;
        int container;
        container=num1;
        num1=num2;
        num2=container;
    }
    //4.заполнить массив степенями числа 2 , где степени от 1 до n
    public static void task4(long[]arr,int maxN) {
        int n=1;
        int index=0;
        while (n<=maxN){
            long res=1;
            int counter=1;
            while (counter<=n){
                res=res*2;
                counter=counter+1;
            }
            arr[index]=res;
            index=index+1;
            n=n+1;
        }
    }
    //5.выполнить задание из рункта 3, но без использования дополнительной переменной
    public  static void task5() {
        int num1=15;
        int num2=5;
        num1=num2+num1;
        num2=num1-num2;
        num1=num2-num1;
    }
    //создать метод public static void task___()
    //Объявить переменную типа float и проиницилизировать
    //ее значением прямо в коде. Объявить перемнную y
    //типа Integer  и присвоить ей  значение из переменной x без использования
    //вызовов методов  какого - либо класса.
    public static void task6(){
        float x =25.3f;
        Integer y=(int)x;
    }
    //создать метод public static void task___()
    //создать в методе 2 строки "abc" и "abc" в переменных String  str1
    // и String  str2 так, чтобы выражение  str1==str2 возвращало false
    public static void task7(){
        String str1=new String("abc");
        String str2="abc";
    }
    /*
     создать метод public static void task___()
     Создать в методе две переменных Integer num1
     и Integer num2 со значениями 5 и 5 так,чтобы
     выражение num1==num2 возвращало false
     */
    public  static void task8(){
    Integer num1=5;
    Integer num2=new Integer(5);
    }
    /*
 создать метод public static void task___()
 Используя тернарный оператор  И System.out.println()
 сравнить 2 числа и распечатать true или false . Все это необходимо
 реалтзовать в одну строку кода внутри метода.
     */
    public static void task9(){
        System.out.println(2 < 5 ? true : false);
    }
    /*
     создать метод public static void task___()
     Объявить в методе переменную int x и сразу проинициализировать ее
     значением 5. Следующей строкой кода сначала вывести значение переменной
     в терминал, а затем уменьшить значение переменной  на 1
     (тоесть внутри метода должно быть 2 строки кода всего)
     */
    public  static void task10(){
        int x =5;
        System.out.println(x--);

    }


    /*

     */
}
