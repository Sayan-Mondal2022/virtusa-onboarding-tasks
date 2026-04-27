// Question: Find minimum number in a list
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinimumNumber {
    public static void main(String[] args) {
        /*
         * Sample Input: [45, 12, 89, 23, 5]
         * Expected Output: 
         * Minimum number: 5
         */
        List<Integer> numbers = Arrays.asList(45, 12, 89, 23, 5);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(m -> System.out.println("Minimum number: " + m));
    }
}
