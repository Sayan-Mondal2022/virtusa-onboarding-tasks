// Question: Create frequency map of characters
package assignment_3;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyMap {
    public static void main(String[] args) {
        /*
         * Sample Input: "programming"
         * Expected Output: 
         * p: 1
         * r: 2
         * o: 1
         * g: 2
         * a: 1
         * m: 2
         * i: 1
         * n: 1
         */
        String str = "programming";
        
        Map<Character, Long> frequencyMap = str.chars()
                                               .mapToObj(c -> (char) c)
                                               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                                               
        frequencyMap.forEach((c, count) -> System.out.println(c + ": " + count));
    }
}
