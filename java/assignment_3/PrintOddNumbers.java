// Question: Print odd numbers from a list
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class PrintOddNumbers {
    public static void main(String[] args) {
        /*
         * Sample Input: [10, 15, 20, 25, 30]
         * Expected Output: 
         * 15
         * 25
         */
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.stream()
               .filter(n -> n % 2 != 0)
               .forEach(System.out::println);
    }
}
