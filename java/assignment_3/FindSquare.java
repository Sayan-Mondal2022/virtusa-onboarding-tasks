// Question: Find the square of each number
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class FindSquare {
    public static void main(String[] args) {
        /*
         * Sample Input: [1, 2, 3, 4]
         * Expected Output: 
         * 1
         * 4
         * 9
         * 16
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
