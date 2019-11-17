package Task5;

public class IsPalindrome {
    static boolean isPalindrome(int normalNum) {        // Проверка числа на палиндром
        int reverseNum = 0;
        int tempNum = normalNum;

        while (tempNum != 0) {                                  // Получаем число "перевертыш"
            reverseNum = (reverseNum * 10) + (tempNum % 10);
            tempNum /= 10;
        }

        return normalNum == reverseNum; // Сравниваем нормальное число и "число-перевертыш"
    }
}
