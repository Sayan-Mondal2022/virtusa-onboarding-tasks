// Question: Convert list of strings to uppercase
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class ConvertStringsToUppercase {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "cherry"]
         * Expected Output: 
         * APPLE
         * BANANA
         * CHERRY
         */
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
