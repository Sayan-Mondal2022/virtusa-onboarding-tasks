// Question: Filter numbers greater than 50
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class FilterNumbers {
    public static void main(String[] args) {
        /*
         * Sample Input: [10, 55, 20, 80, 45, 90]
         * Expected Output: 
         * 55
         * 80
         * 90
         */
        List<Integer> numbers = Arrays.asList(10, 55, 20, 80, 45, 90);
        numbers.stream()
               .filter(n -> n > 50)
               .forEach(System.out::println);
    }
}
