package Senla.Task4;

public class SearchWordCount {
    public static void searchWordCount(String text, String word) {
        int count = 0;

        for(String str : text.split(" ")){
            if (str.toLowerCase().equals(word.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Слово \"" + word + "\" встречается в тексте " + count + " раз(а)");
    }
}
