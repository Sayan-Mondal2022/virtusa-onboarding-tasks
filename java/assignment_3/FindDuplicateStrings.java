// Question: Find duplicate strings
package assignment_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "apple", "cherry", "banana", "date"]
         * Expected Output: 
         * apple
         * banana
         */
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        Set<String> seen = new HashSet<>();
        
        words.stream()
             .filter(w -> !seen.add(w))
             .distinct()
             .forEach(System.out::println);
    }
}
