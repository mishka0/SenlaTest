package Task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSentence {                                    // Ввод предложения
    public static String inputSentence() throws IOException {
        String inputSentence;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inputSentence = reader.readLine();
        return inputSentence;
    }
}
