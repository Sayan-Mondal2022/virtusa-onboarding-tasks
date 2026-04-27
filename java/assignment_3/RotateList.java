// Question: Rotate list using streams
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateList {
    public static void main(String[] args) {
        /*
         * Sample Input: [1, 2, 3, 4, 5]
         * Rotate right by: 2
         * Expected Output: 
         * 4
         * 5
         * 1
         * 2
         * 3
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int k = 2; // Positions to rotate right
        int size = numbers.size();
        
        if (size > 0) {
            k = k % size; // Handle k > size
            
            List<Integer> rotated = Stream.concat(
                    numbers.stream().skip(size - k),
                    numbers.stream().limit(size - k)
            ).collect(Collectors.toList());
            
            rotated.forEach(System.out::println);
        }
    }
}
