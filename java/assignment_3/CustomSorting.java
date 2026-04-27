// Question: Implement custom sorting using lambda
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "watermelon", "cherry"]
         * Expected Output: 
         * apple
         * cherry
         * banana
         * watermelon
         */
        List<String> words = Arrays.asList("apple", "banana", "watermelon", "cherry");
        
        // Custom sort: by length of the string
        words.stream()
             .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
             .forEach(System.out::println);
    }
}
