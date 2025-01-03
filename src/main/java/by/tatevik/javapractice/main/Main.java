package by.tatevik.javapractice.main;

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

        task21();
    }

    //1. вывести элементы массива в обратном порядке на экран

    public static void printRevertArr(int[] arr) {
        int index = arr.length - 1;
        while (index >= 0) {
            System.out.print(arr[index] + " ");
            index = index - 1;
        }
    }

    //2. заполнить массив  первыми 25 натуральными числами(1,2,3,4.....)
    //затем добавить в него 100, 200

    public static void task2(int[] arr) {
        int index = 0;
        int num = 1;
        while (index <= 24) {
            arr[index] = num;
            index = index + 1;
            num = num + 1;
        }
        arr[25] = 100;
        arr[26] = 200;
    }

    //3.Создать метод public static void task3().
    //Внутри него объявить 2 переменных типа int,
    // проинициализировать их прямо в коде. Затем
    // поменять местами значения в переменных без использования
    // литералов, но с использованием дополнительной переменной.

    public static void task3() {
        int num1 = 20;
        int num2 = 25;
        int container;
        container = num1;
        num1 = num2;
        num2 = container;
    }

    //4.заполнить массив степенями числа 2 , где степени от 1 до n

    public static void task4(long[] arr, int maxN) {
        int n = 1;
        int index = 0;
        while (n <= maxN) {
            long res = 1;
            int counter = 1;
            while (counter <= n) {
                res = res * 2;
                counter = counter + 1;
            }
            arr[index] = res;
            index = index + 1;
            n = n + 1;
        }
    }

    //5.выполнить задание из рункта 3, но без использования дополнительной переменной

    public static void task5() {
        int num1 = 15;
        int num2 = 5;
        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num2 - num1;
    }

    //создать метод public static void task___()
    //Объявить переменную типа float и проиницилизировать
    //ее значением прямо в коде. Объявить перемнную y
    //типа Integer  и присвоить ей  значение из переменной x без использования
    //вызовов методов  какого - либо класса.

    public static void task6() {
        float x = 25.3f;
        Integer y = (int) x;
    }

    //создать метод public static void task___()
    //создать в методе 2 строки "abc" и "abc" в переменных String  str1
    // и String  str2 так, чтобы выражение  str1==str2 возвращало false

    public static void task7() {
        String str1 = new String("abc");
        String str2 = "abc";
    }

    /*
     создать метод public static void task___()
     Создать в методе две переменных Integer num1
     и Integer num2 со значениями 5 и 5 так,чтобы
     выражение num1==num2 возвращало false
     */
    public static void task8() {
        Integer num1 = 5;
        Integer num2 = new Integer(5);
    }

    /*
 создать метод public static void task___()
 Используя тернарный оператор  И System.out.println()
 сравнить 2 числа и распечатать true или false . Все это необходимо
 реалтзовать в одну строку кода внутри метода.
     */
    public static void task9() {
        System.out.println(2 < 5 ? true : false);
    }

    /*
     создать метод public static void task___()
     Объявить в методе переменную int x и сразу проинициализировать ее
     значением 5. Следующей строкой кода сначала вывести значение переменной
     в терминал, а затем уменьшить значение переменной  на 1
     (тоесть внутри метода должно быть 2 строки кода всего)
     */
    public static void task10() {
        int x = 5;
        System.out.println(x--);
    }

    /*
 создать метод public static void task___()
 Объявить в методе переменную int x и сразу проинициализировать ее
 значением 7. Следующей строкой кода сначала увеличить значение переменной,
 а затем вывести в терминал, а затем уменьшить значение переменной  на 1
 (тоесть внутри метода должно быть 2 строки кода всего)
 */
    public static void task11() {
        int x = 7;
        System.out.println(++x);
    }

    /*
создать метод public static void task___()
Объявить  переменную char sign и сразу проинициализировать ее
значением "а". Используя цикл while и переменную sign вывести
в терминал все буквы от a до z
*/

    public static void task12() {
        char sign = 'a';
        // while (sign<=127){
        //   System.out.println(sign+" ");
        //  sign++;
        // }
        StringBuilder sb = new StringBuilder();
        while (sign <= 122) {
            sb.append(sign++);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    /*
создать метод public static void task___()
Реализовать в методе цикл while (true), (циклб у которого
 в условии написано true ), которые распечатает числа только от 1-5
 */
    public static void task13() {
        int x = 1;
        while (true) {
            System.out.println(x);
            if (x == 5) {
                break;
            }
            x++;
        }
    }

    /*
    определить количество всех трехзначных чисел,
    кратных 7 и также сумма цифр котрых равна 7;
    */

    public static void task14() {
        int x = 100;
        int counter = 0;
        while (x <= 999) {
            if (x % 7 == 0) {
                int digitSum = 0;
                int num = x;
                while (num > 0) {
                    digitSum = digitSum + num % 10;//123 % 10=3; 25 % 10=5; 3 % 10=3;
                    num = num / 10;//123/10=12;25/10=2;3/10=0
                }
                if (digitSum % 7 == 0) {
                    counter++;
                }
            }
            x++;
        }
        System.out.println(counter);
    }

    /*
    Создать метод public static void task().
    Создать в методе переменную String str и проинициализировать её значением:
    «Dorothy lived in the midst of the great Kansas prairies, with Uncle Henry,
    who was a farmer, and Aunt Em, who was the farmer's wife.»
    Написать в методе код, который посчитает количество слов в
    этом предложении. (код должен сработать для любого предложения,
    с любым количеством слов, а не только этого). запрещено использование
    методов типа split

    */

    public static void task15() {
        String str = "Dorothy lived in the midst of the great Kansas prairies, with Uncle Henry, " +
                "who was a farmer, and Aunt Em, who was the farmer's wife.";
        int index = 0;
        int strSize = str.length();
        int counter = 0;
        while (index < strSize) {
            if (str.charAt(index) == ' ') {
                counter++;

            }
            index++;
        }
        System.out.println(++counter);
    }

    /*
    Создать метод public static void task....().
    Написать в методе код, который заполняет массив из 10 элементов числами фибоначчи,
    начиная с начала ряда.
  */

    public static void task16() {
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        int index = 2;
        while (index < arr.length) {
            arr[index] = arr[index - 1] + arr[index - 2];
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
  Создать метод public static void task....().
  Создать массив и заполнить его в цикле while заглавными
  буквами английского алфавита без использования ввода с клавиатуры.
  */

    public static void task17() {
        int size = 'Z' - 'A' + 1;
        char[] arr = new char[size];
        char sign = 'A';
        int index = 0;
        while (index < size) {
            arr[index] = sign;
            index++;
            sign++;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
  Создать метод public static void task15().
  Создать массив типа float и размера 20.
  Проинициализировать его в цикле случайными значениями
  в диапазоне от 163.0 до 197.0 (не включая 197).
   */

    public static void task18() {
        float[] arr = new float[20];
        int index = 0;
        while (index < arr.length) {
            arr[index] = (float) (163 + Math.random() * 34);
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
  Создать метод public static void task16().
  Объявить массив типа int и размера 3. Проинициализировать массив
  значениями 11, 22, 33. Поменять значения местами так, чтобы в массиве
  они оказались в следующем порядке: 22 33 11. Это необходимо выполнить
  без использования дополнительной переменной.
   */

    public static void task19() {
        int[] arr = new int[]{11, 22, 33};
        arr[0] = arr[0] + arr[1];//11+22
        arr[1] = arr[0] - arr[1];//33-22 {33,11,33}
        arr[0] = arr[0] - arr[1];//33-11{22,11,33}
        arr[2] = arr[2] + arr[1];//33-11{22,11,44}
        arr[1] = arr[2] - arr[1];//33-11{22,33,44 }
        arr[2] = arr[2] - arr[1];//33-11{22,33,11}
        System.out.println(Arrays.toString(arr));
    }

    /*
    Создать метод public static void task17().
    Объявить и проинициализировать переменную int x  внутри метода.
    Написать ниже код так, чтобы если переменная == 0 выводился в терминал 0,
    если больше 0, то выводилась в терминал 1, если меньше 0, выводилась
    в терминал -1. Код необходимо написать так, чтобы выполнялось как можно
    меньше вычислений условий.
    */

    public static void task20() {
        int x = 5;
        int res = 0;
        if (x < 5) {
            res = -1;
        } else if (x > 0) {
            res = 1;
        } else {
            res = 0;
        }
        System.out.println(res);
    }

    /*
    Создать метод public static void task18().
    Объявить в методе переменную String str1 и проинициализировать
    словом на английском языке длиной хотя бы 7 символов. Объявить переменную
    String str2 и написать код, который сохранит в переменную str2 значение переменной
    str1 перевернутое из конца в начало. то есть сохранит строку с символами, написанными
    в обратном порядке, из конца в начало. Запрещается использование методов типа revert
    */

    public static void task21() {
        String str1="Dorothy";
        String str2;
        StringBuilder sb=new StringBuilder(7);
        int index=str1.length()-1;
        while (index>=0){
           sb.append(str1.charAt(index));
           index--;
        }
            str2= sb.toString();
            System.out.println(str1);
            System.out.println(str2);
    }

}