// Question: Find kth largest element
package assignment_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class KthLargestElement {
    public static void main(String[] args) {
        /*
         * Sample Input: [10, 5, 20, 8, 15]
         * k = 2
         * Expected Output: 
         * 2nd largest element: 15
         */
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 15);
        int k = 2;
        
        Optional<Integer> kthLargest = numbers.stream()
                                              .sorted(Collections.reverseOrder())
                                              .skip(k - 1)
                                              .findFirst();
                                              
        kthLargest.ifPresent(n -> System.out.println(k + "nd largest element: " + n));
    }
}
