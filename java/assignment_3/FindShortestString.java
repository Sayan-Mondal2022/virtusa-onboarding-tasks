// Question: Find shortest string
package assignment_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindShortestString {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "watermelon", "kiwi", "cherry"]
         * Expected Output: 
         * Shortest string: kiwi
         */
        List<String> words = Arrays.asList("apple", "banana", "watermelon", "kiwi", "cherry");
        Optional<String> shortest = words.stream()
                                         .min(Comparator.comparingInt(String::length));
        shortest.ifPresent(s -> System.out.println("Shortest string: " + s));
    }
}
