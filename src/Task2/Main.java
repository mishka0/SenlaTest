package Task2;
/*
    Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное)
    и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
    Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Числа не должны быть равны 0");
            num1 = InputInt.inputInt();
            num2 = InputInt.inputInt();
        }    while(num1 ==0 || num2 ==0);


        System.out.println("Наибольший общий делитель: " + GreatestCommonDivisor.gcd(num1, num2));
        System.out.println("Наименьшее общее кратное: " + HighestCommonFactor.hcf(num1, num2));
    }
}
