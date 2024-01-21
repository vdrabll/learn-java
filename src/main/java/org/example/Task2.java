/**
 This is bunch of java core practice tasks i solve to learn this beautiful language.
 This is 1 lvl tasks about basic things like operators strings and so on.
  */

package org.example;

public class Task2 {

    // Дана строка. Выведите в консоль длину этой строки и ее последний смвол.

    void findLenghOf(String string) {
        System.out.printf("Длинна вашей строки: %s /n Последний элемент: %s", string.length(), "efe");
    }

    // Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
     void findIfNumberNegative(int number) {
         if (number > 0) {
             System.out.println("Ваше число больше нуля");
         } else {
             System.out.println("Ваше число меньше нуля");
         }
     }
}
