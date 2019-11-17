
package Task1;
/*
        Создать программу, которая будет сообщать, является ли целое число,
        введенное пользователем, чётным или нечётным, простым или составным.
        Если пользователь введёт не целое число, то сообщать ему об ошибке.

 */
public class Main {
    public static void main(String[] args) {
        int num;
        num = InputInt.inputInt();
        System.out.println("Число \"" + num + "\" " + IsPrime.isPrime(num));                      // Проверка числа (составное или простое)
        System.out.println("Число \"" + num + "\" " + IsEven.isEven(num));                        // Проверка числа (четное или нечетное)
    }
}
