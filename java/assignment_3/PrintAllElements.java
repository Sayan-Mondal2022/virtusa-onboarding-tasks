// Question: Print all elements of a list using streams
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class PrintAllElements {
    public static void main(String[] args) {
        /*
         * Sample Input: [1, 2, 3, 4, 5]
         * Expected Output: 
         * 1
         * 2
         * 3
         * 4
         * 5
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().forEach(System.out::println);
    }
}
