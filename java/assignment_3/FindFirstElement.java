// Question: Find first element of list
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "cherry"]
         * Expected Output: 
         * First element: apple
         */
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Optional<String> first = words.stream().findFirst();
        first.ifPresent(f -> System.out.println("First element: " + f));
    }
}
