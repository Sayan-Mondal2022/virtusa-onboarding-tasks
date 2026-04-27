// Question: Find average of numbers
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {
    public static void main(String[] args) {
        /*
         * Sample Input: [10, 20, 30, 40, 50]
         * Expected Output: 
         * Average: 30.0
         */
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        OptionalDouble average = numbers.stream()
                                        .mapToInt(Integer::intValue)
                                        .average();
        average.ifPresent(avg -> System.out.println("Average: " + avg));
    }
}
