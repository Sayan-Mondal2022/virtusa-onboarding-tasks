// Question: Count vowels in each string
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class CountVowels {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "cherry"]
         * Expected Output: 
         * apple: 2
         * banana: 3
         * cherry: 1
         */
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        
        words.forEach(w -> {
            long vowelCount = w.toLowerCase().chars()
                               .filter(c -> "aeiou".indexOf(c) != -1)
                               .count();
            System.out.println(w + ": " + vowelCount);
        });
    }
}
