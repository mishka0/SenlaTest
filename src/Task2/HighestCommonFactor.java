package Task2;

public class HighestCommonFactor {

    public static int hcf(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        return (a * b) / GreatestCommonDivisor.gcd(a, b); // Находим наибольшее общее кратное с помощью наибольшего общего делителя
    }
}
