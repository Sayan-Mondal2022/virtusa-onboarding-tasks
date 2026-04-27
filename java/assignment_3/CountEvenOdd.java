// Question: Count even and odd numbers
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEvenOdd {
    public static void main(String[] args) {
        /*
         * Sample Input: [1, 2, 3, 4, 5, 6, 7]
         * Expected Output: 
         * Even count: 3
         * Odd count: 4
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        
        Map<Boolean, Long> counts = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
            
        System.out.println("Even count: " + counts.get(true));
        System.out.println("Odd count: " + counts.get(false));
    }
}
