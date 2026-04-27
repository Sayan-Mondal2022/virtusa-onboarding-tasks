// Question: Chain multiple stream operations together
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChainOperations {
    public static void main(String[] args) {
        /*
         * Sample Input: [10, 5, 20, 15, 8, 25]
         * Operations: 
         * 1. Filter greater than 10
         * 2. Multiply by 2
         * 3. Sort ascending
         * 4. Collect to list
         * 
         * Expected Output: 
         * [30, 40, 50]
         */
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 8, 25);
        
        List<Integer> result = numbers.stream()
                                      .filter(n -> n > 10)
                                      .map(n -> n * 2)
                                      .sorted()
                                      .collect(Collectors.toList());
                                      
        System.out.println(result);
    }
}
