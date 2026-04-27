// Question: Find first non-repeated character in a string
package assignment_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        /*
         * Sample Input: "swiss"
         * Expected Output: 
         * First non-repeated character: w
         */
        String str = "swiss";
        
        Character firstNonRepeated = str.chars()
                                        .mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                                        .entrySet()
                                        .stream()
                                        .filter(entry -> entry.getValue() == 1)
                                        .map(Map.Entry::getKey)
                                        .findFirst()
                                        .orElse(null);
                                        
        System.out.println("First non-repeated character: " + firstNonRepeated);
    }
}
