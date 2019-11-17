
package Senla.Task1;
/*
        Создать программу, которая будет сообщать, является ли целое число,
        введенное пользователем, чётным или нечётным, простым или составным.
        Если пользователь введёт не целое число, то сообщать ему об ошибке.

 */

import Senla.NumOperations;
import Senla.Reader;

public class Main {
    public static void main(String[] args) {
        int num;
        NumOperations numOperations = new NumOperations();

        Reader reader = new Reader();

        num = reader.readInt();
        System.out.println("Число \"" + num + "\" " + numOperations.isPrime(num));                      // Проверка числа (составное или простое)
        System.out.println("Число \"" + num + "\" " + numOperations.isEven(num));                        // Проверка числа (четное или нечетное)
    }
}
