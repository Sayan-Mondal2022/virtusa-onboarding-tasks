// Question: Find palindrome strings in list
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class FindPalindromes {
    public static void main(String[] args) {
        /*
         * Sample Input: ["radar", "apple", "level", "world", "madam"]
         * Expected Output: 
         * radar
         * level
         * madam
         */
        List<String> words = Arrays.asList("radar", "apple", "level", "world", "madam");
        
        words.stream()
             .filter(w -> w.equals(new StringBuilder(w).reverse().toString()))
             .forEach(System.out::println);
    }
}
