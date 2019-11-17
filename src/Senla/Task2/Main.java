package Senla.Task2;
/*
    Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное)
    и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
    Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.

 */

import Senla.NumOperations;
import Senla.Reader;


public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();
        NumOperations numOperations = new NumOperations();
        int firstNum, secondNum;

        do {
            System.out.println("Числа не должны быть равны 0");
            firstNum = reader.readInt();
            secondNum = reader.readInt();
        }    while(firstNum == 0 || secondNum == 0);

        System.out.println("Наибольший общий делитель: " + numOperations.greatestCommonDivisor(firstNum, secondNum));
        System.out.println("Наименьшее общее кратное: " + numOperations.highestCommonFactor(firstNum, secondNum));
    }
}
