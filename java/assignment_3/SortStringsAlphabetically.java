// Question: Sort strings alphabetically
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class SortStringsAlphabetically {
    public static void main(String[] args) {
        /*
         * Sample Input: ["banana", "apple", "cherry", "date"]
         * Expected Output: 
         * apple
         * banana
         * cherry
         * date
         */
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
        words.stream()
             .sorted()
             .forEach(System.out::println);
    }
}
