// Question: Find longest string in list
package assignment_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "watermelon", "cherry"]
         * Expected Output: 
         * Longest string: watermelon
         */
        List<String> words = Arrays.asList("apple", "banana", "watermelon", "cherry");
        Optional<String> longest = words.stream()
                                        .max(Comparator.comparingInt(String::length));
        longest.ifPresent(l -> System.out.println("Longest string: " + l));
    }
}
