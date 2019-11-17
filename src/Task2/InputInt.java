package Task2;
import java.util.Scanner;

public class InputInt {
    public static int inputInt() {                                      //Осуществление пользовательского ввода
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean good = true;
        do {
            System.out.print("Введите целое число: ");
            try {
                num = Integer.parseInt(sc.nextLine());
                good = false;
            } catch (Exception e) {
                System.out.println("Некорректный ввод " + e);
            }
        } while (good);
        return num;
    }
}

