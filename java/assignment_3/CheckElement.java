// Question: Check if list contains a specific element
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class CheckElement {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "cherry"]
         * Target: "banana"
         * Expected Output: 
         * Contains 'banana': true
         */
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String target = "banana";
        boolean contains = words.stream().anyMatch(w -> w.equals(target));
        System.out.println("Contains '" + target + "': " + contains);
    }
}
