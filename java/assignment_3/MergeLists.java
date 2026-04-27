// Question: Merge two lists using streams
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeLists {
    public static void main(String[] args) {
        /*
         * Sample Input: 
         * List 1: [1, 2, 3]
         * List 2: [4, 5, 6]
         * Expected Output: 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         */
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        
        Stream.concat(list1.stream(), list2.stream())
              .forEach(System.out::println);
    }
}
