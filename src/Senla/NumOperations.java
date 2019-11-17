package Senla;

public class NumOperations {

    public  String isEven(int num) {
        if (num % 2 == 0) {
            return "Четное число";
        } else {
            return "Нечётное число";
        }
    }

    public  String isPrime(int num) {
        if (num < 2)
            return "Не является ни простым ни составным числом.";
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return "Составное число";
        return "Простое число";
    }

    public int highestCommonFactor(int firstNum, int secondNum) {

        firstNum = Math.abs(firstNum);
        secondNum = Math.abs(secondNum);

        return (firstNum * secondNum) / greatestCommonDivisor(firstNum, secondNum); // Находим наибольшее общее кратное с помощью наибольшего общего делителя
    }

    public int greatestCommonDivisor(int firstNum, int secondNum) {

        firstNum = Math.abs(firstNum);
        secondNum = Math.abs(secondNum);

        while(firstNum != 0 && secondNum != 0){
            if (firstNum > secondNum)
                firstNum = firstNum % secondNum;
            else
                secondNum = secondNum % firstNum;
        }
        return firstNum + secondNum;
    }
}
