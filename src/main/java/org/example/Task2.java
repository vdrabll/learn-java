/**
 This is bunch of java core practice tasks i solve to learn this beautiful language.
 This is 1 lvl tasks about basic things like operators strings basic types and so on.
  */

package org.example;

import java.util.*;

public class Task2 {

    //Дан массив целых чисел и ещё одно целое число.
    // Удалите все вхождения этого числа из массива (пропусков быть не должно).
    void clearArray(int[] array, int targetNumber)
    {
        Arrays.stream(array)
                .filter(n -> n != targetNumber)
                .forEach(s-> System.out.println(s));
    }

   // Реализуйте алгоритм сортировки пузырьком для сортировки массива
    void bubleSort()
    {
        int[] testArray = new int[]{1, 2, 4, 5, 6, 7, 66, 3, 1};
        {
            for (int i = 0; i < testArray.length - 1; i++) {
                    if (testArray[i] > testArray[i + 1]) {
                        int value = testArray[i];
                        testArray[i] = testArray[i + 1];
                        testArray[i + 1] = value;
                        // swap(array[i] ,array[i + 1] ); доступно для Сollections
                    }

            }
            for (int i = 0; i < testArray.length; i++) {
                System.out.println(testArray[i]);
            }
        }
    }

    // Заполните массив случайным числами и выведите максимальное,
    // минимальное и среднее значение.
    void arrayAnaliser()
    {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            Random randomiser = new Random();
            array[i] = randomiser.nextInt(1000);
        }

        OptionalInt max = Arrays.stream(array).max();

        OptionalInt min = Arrays.stream(array).min();

        long mean = Arrays.stream(array).sum() / Arrays.stream(array).count();

        System.out.printf("Максимальное значение: %s, минимальное знаечение: %s, среднее: %s",
                max, min, mean);
    }


    //Дано целое число, содержащее номер месяца от 1 до 12:
    //Определите, в какую пору года попадает этот месяц.
    void mountOf(int number)
    {
         String[] namesOfMounts = new String[] {"January", "February",
                 "March", "April", "May",
                 "June", "July", "Agust",
                 "September", "October", "November",
                 "Desember"} ;

       if ( number == 1 ) {
           System.out.printf("Вы выбрали: %s", namesOfMounts[0]);
       } if (namesOfMounts.length > number || number == 12) {
           System.out.printf("Вы выбрали: %s", namesOfMounts[number - 1]);
       } else   {
        System.out.println("В году всего 12 месяцев((");
    }
    }

    //Даны два целых числа. Найдите остаток от деления первого числа на второе.
    void findWhatLeft(int first, int second)
    {
        int leftoves = first % second;
        System.out.printf("%s % %s = %s",
                first,
                second,
                leftoves);
    }

    //Дана строка. Если в этой строке более одного символа,
    //выведите в консоль предпоследний символ этой строки.
    void checkString(String str)
    {
        if (str.length() > 1) {
            System.out.println(str.charAt(str.length() - 2));
        } else {
            System.out.println("Эта строкка короче 1 сомвола");
        }

    }

    //Выведите в консоль все целые числа от 1 до 100.
    void showOddNumbers()
    {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Дано целое число. Выведите в консоль первые и последние цифры этого числа.
    void fistNumber(int number)
    {
        String str = String.valueOf(number);
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        int sum = ((int) first + last);
        System.out.printf("Первая цифра этого числа: %s, последняя цифра: %s, их сумма: %s. Длинна: %s ",
                first,
                last,
                sum,
                str.length());
    }

    //Дано слово. Получите его последнюю букву.
    //Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.
    char findLastChar(String word)
    {
        char last = word.charAt(word.length() - 1);
        if (last == 'ь') {
            return word.charAt(last - 1);
        } else {
            return last;
        }
    }

    //Даны два слова. Проверьте, что первые буквы этих слов совпадают.
    void compare(String string1,String string2)
    {
        if (string1.charAt(0) == string2.charAt(0)) {
            System.out.println("первые буквы этих слов совпадают");
        } else {
            System.out.println("первые буквы этих слов не совпадают");
        }
    }

    // Дано число. Проверьте, четное оно или нет.
    void oddNumber(int number)
    {
        if (number % 2 == 0) {
            System.out.printf("Это число четное");
        } else {
            System.out.println("Это не четное число");
        }
    }

    // Дана строка. Выведите в консоль длину этой строки и ее последний символ.
    void findLenghOf(String string)
    {
        System.out.printf("Длинна вашей строки: %s /n Последний элемент: %s",
                string.length(),
                string.charAt(string.length() - 1));
    }

    // Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
     void findIfNumberNegative(int number)
     {
         if (number > 0) {
             System.out.println("Ваше число больше нуля");
         } else {
             System.out.println("Ваше число меньше нуля");
         }
     }
}
