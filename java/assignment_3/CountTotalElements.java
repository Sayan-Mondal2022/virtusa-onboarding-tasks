// Question: Count total elements in a list
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class CountTotalElements {
    public static void main(String[] args) {
        /*
         * Sample Input: ["a", "b", "c", "d"]
         * Expected Output: 
         * Total elements: 4
         */
        List<String> elements = Arrays.asList("a", "b", "c", "d");
        long count = elements.stream().count();
        System.out.println("Total elements: " + count);
    }
}
