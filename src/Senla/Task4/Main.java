package Senla.Task4;
/*
    Создать программу, которая подсчитывает сколько раз употребляется
    слово в тексте (без учета регистра).
    Текст и слово вводится вручную.

 */

import Senla.Reader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader reader = new Reader();
        String clearText;

        System.out.println("Введите текст: ");
        String inputText = reader.readString();

        System.out.println("Введите слово для поиска: ");
        String searchWord = reader.readString();

        clearText = inputText.replaceAll("\\p{Punct}", "");

        SearchWordCount.searchWordCount(clearText, searchWord);

    }
}

