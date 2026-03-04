// Count the frequency of words in a sentence using a HashMap

import java.util.HashMap;

public class WordsCount {
    public static void main(String[] args) {
        HashMap<String, Integer> freq = new HashMap<>();

        String text = "This is hi from java, java is a purely object oriented programming language";
        String[] words = text.split("[ ,]");

        System.out.println("Text is: " + text);
        for (String word : words) {
            if (!word.isEmpty()) {
                freq.put(word.toLowerCase(), freq.getOrDefault(word.toLowerCase(), 0) + 1);
            }
        }

        // System.out.println(freq);
        System.out.println();
        for (HashMap.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
