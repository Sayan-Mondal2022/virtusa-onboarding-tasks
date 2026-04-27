// Question: Reverse each string in a list
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class ReverseStrings {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "cherry"]
         * Expected Output: 
         * elppa
         * ananab
         * yrrehc
         */
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.stream()
             .map(w -> new StringBuilder(w).reverse().toString())
             .forEach(System.out::println);
    }
}
