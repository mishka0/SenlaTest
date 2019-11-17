package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputText {
    public static String inputText() throws IOException {   // Ввод пользовательского текста
        String inputText;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inputText = reader.readLine();
        return inputText;
    }

}
