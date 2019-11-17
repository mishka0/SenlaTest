package Task2;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while(a != 0 && b != 0){
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        return a + b;
    }
}
