package Task1;

public class IsPrime {
    public static String isPrime(int num) {
        if (num < 2)
            return "Не является ни простым ни составным числом.";
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return "Составное число";
        return "Простое число";
    }

}
