// Question: Find sum of digits of numbers
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
         * Sample Input: [123, 45, 67]
         * Expected Output: 
         * 123 -> 6
         * 45 -> 9
         * 67 -> 13
         */
        List<Integer> numbers = Arrays.asList(123, 45, 67);
        
        numbers.forEach(n -> {
            int sum = String.valueOf(Math.abs(n)).chars()
                            .map(Character::getNumericValue)
                            .sum();
            System.out.println(n + " -> " + sum);
        });
    }
}
