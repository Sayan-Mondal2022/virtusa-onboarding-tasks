// Question: Sort a list in ascending order
package assignment_3;

import java.util.Arrays;
import java.util.List;

public class SortListAscending {
    public static void main(String[] args) {
        /*
         * Sample Input: [5, 2, 8, 1, 3]
         * Expected Output: 
         * 1
         * 2
         * 3
         * 5
         * 8
         */
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
