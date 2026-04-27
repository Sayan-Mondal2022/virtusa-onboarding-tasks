// Question: Remove repeated characters from string
package assignment_3;

import java.util.stream.Collectors;

public class RemoveRepeatedCharacters {
    public static void main(String[] args) {
        /*
         * Sample Input: "programming"
         * Expected Output: 
         * progamin
         */
        String str = "programming";
        
        String uniqueChars = str.chars()
                                .distinct()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining());
                                
        System.out.println(uniqueChars);
    }
}
