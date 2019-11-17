package Senla.Task5;

import Senla.Reader;

/*
    Создать программу, которая в последовательности от 0 до N,
    находит все числа-палиндромы (зеркальное значение равно оригинальному).
    Длина последовательности N вводится вручную и не должна превышать 100.

 */
public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int number = reader.readInt();

        while(number < 0 || number > 100) {
            number = reader.readInt();
        }

        for (int i = 0; i <= number; i++) {
            if (IsPalindrome.isPalindrome(i)) {
                System.out.println(i);
            }
        }

    }
}

