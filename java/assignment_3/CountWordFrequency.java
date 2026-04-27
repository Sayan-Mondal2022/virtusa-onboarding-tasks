// Question: Count frequency of each word
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordFrequency {
    public static void main(String[] args) {
        /*
         * Sample Input: ["apple", "banana", "apple", "cherry", "banana", "apple"]
         * Expected Output: 
         * banana: 2
         * apple: 3
         * cherry: 1
         */
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> frequencyMap = words.stream()
                                              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        frequencyMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
