// Question: Find sum of all elements
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class FindSum {
    public static void main(String[] args) {
        /*
         * Sample Input: [10, 20, 30, 40, 50]
         * Expected Output: 
         * Sum: 150
         */
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum: " + sum);
    }
}
