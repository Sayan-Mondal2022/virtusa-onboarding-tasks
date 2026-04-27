// Question: Find maximum number in a list
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumNumber {
    public static void main(String[] args) {
        /*
         * Sample Input: [45, 12, 89, 23, 5]
         * Expected Output: 
         * Maximum number: 89
         */
        List<Integer> numbers = Arrays.asList(45, 12, 89, 23, 5);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(m -> System.out.println("Maximum number: " + m));
    }
}
