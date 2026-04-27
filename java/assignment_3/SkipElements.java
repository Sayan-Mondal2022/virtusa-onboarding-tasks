// Question: Skip first 3 elements and print the rest
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class SkipElements {
    public static void main(String[] args) {
        /*
         * Sample Input: [1, 2, 3, 4, 5, 6, 7]
         * Expected Output: 
         * 4
         * 5
         * 6
         * 7
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        numbers.stream()
               .skip(3)
               .forEach(System.out::println);
    }
}
