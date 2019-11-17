package Senla.Task3;
/*

    Создать программу, которая будет:
    подсчитывать количество слов в предложении
    выводить их в отсортированном виде
    делать первую букву каждого слова заглавной.
    Предложение вводится вручную. (Разделитель пробел (“ ”)).

 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import Senla.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        String clearSentence;
        Reader reader = new Reader();

        System.out.println("Введите предложение: ");
        String inputSentence = reader.readString();
        int wordsCount = 0;

        ArrayList<String> words = new ArrayList<>();

        clearSentence = inputSentence.replaceAll("\\p{Punct}", "");

        for (String word : clearSentence.split(" ")) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            words.add(word);
            wordsCount++;
        }

        Collections.sort(words);

        for (String word : words) System.out.println(word);
        System.out.println("Количество слов в предложении: " + wordsCount);

    }
}
