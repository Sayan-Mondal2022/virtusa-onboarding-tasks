// Question: Sort a list in descending order
package assignment_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListDescending {
    public static void main(String[] args) {
        /*
         * Sample Input: [5, 2, 8, 1, 3]
         * Expected Output: 
         * 8
         * 5
         * 3
         * 2
         * 1
         */
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        numbers.stream()
               .sorted(Collections.reverseOrder())
               .forEach(System.out::println);
    }
}
