// Question: Limit output to first 5 elements
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class LimitElements {
    public static void main(String[] args) {
        /*
         * Sample Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         * Expected Output: 
         * 1
         * 2
         * 3
         * 4
         * 5
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
               .limit(5)
               .forEach(System.out::println);
    }
}
