package Senla;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reader {
    public int readInt() {
            Scanner sc = new Scanner(System.in);
            int numRead = 0;
            boolean goodNum = true;

            while (goodNum) {
                System.out.print("Введите целое число: ");
                try {
                    numRead = Integer.parseInt(sc.nextLine());
                    goodNum = false;
                } catch (Exception e) {
                    System.out.println("Некорректный ввод " + e);
                }
            }
        return numRead;
    }

    public String readString() throws IOException {
        String inputSentence;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inputSentence = reader.readLine();
        return inputSentence;
    }


}
