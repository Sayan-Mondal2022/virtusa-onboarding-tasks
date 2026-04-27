// Question: Remove empty strings from list
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStrings {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "", "banana", " ", "cherry"]
         * Expected Output: 
         * apple
         * banana
         * cherry
         */
        List<String> words = Arrays.asList("apple", "", "banana", " ", "cherry");
        words.stream()
             .filter(w -> w != null && !w.trim().isEmpty())
             .forEach(System.out::println);
    }
}
