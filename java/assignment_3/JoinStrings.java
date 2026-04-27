// Question: Convert list of strings into a single string (join)
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String[] args) {
        /*
         * Sample Input: ["Hello", "World", "from", "Java"]
         * Expected Output: 
         * Joined string: Hello, World, from, Java
         */
        List<String> words = Arrays.asList("Hello", "World", "from", "Java");
        String joined = words.stream()
                             .collect(Collectors.joining(", "));
        System.out.println("Joined string: " + joined);
    }
}
