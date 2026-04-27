// Question: Count number of strings starting with “A”
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class CountStringsStartingWithA {
    public static void main(String[] args) {
        /*
         * Sample Input: ["Apple", "Banana", "Apricot", "Cherry", "avocado"]
         * Expected Output: 
         * Count: 3
         */
        List<String> words = Arrays.asList("Apple", "Banana", "Apricot", "Cherry", "avocado");
        long count = words.stream()
                          .filter(w -> w.toLowerCase().startsWith("a"))
                          .count();
        System.out.println("Count: " + count);
    }
}
