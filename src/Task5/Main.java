package Task5;

/*
    Создать программу, которая в последовательности от 0 до N,
    находит все числа-палиндромы (зеркальное значение равно оригинальному).
    Длина последовательности N вводится вручную и не должна превышать 100.

 */
public class Main {
    public static void main(String[] args) {
        int num;

        do{                                 // Ввод числа от 0 до 100
            num = InputInt.inputInt();
        } while(num <= 0 || num >= 100);

        for (int i = 0; i <= num; i++) {        // Поиск чисел палиндромов
            if (IsPalindrome.isPalindrome(i)) {
                System.out.println(i);
            }
        }

    }






}

