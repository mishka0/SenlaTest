package Task4;
/*
    Создать программу, которая подсчитывает сколько раз употребляется
    слово в тексте (без учета регистра).
    Текст и слово вводится вручную.

 */

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String inputText;
        String clearText;
        String searchWord;


        System.out.println("Введите текст: ");
        inputText = InputText.inputText();

        System.out.println("Введите слово для поиска: ");
        searchWord = InputText.inputText();

        clearText = inputText.replaceAll("\\p{Punct}", "");

        SearchWordCount.searchWordCount(clearText, searchWord);

    }



}

