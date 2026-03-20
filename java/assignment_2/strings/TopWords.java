// Q17: Top 10 frequent words from a file.
import java.io.*;
import java.util.*;

public class TopWords {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        HashMap<String, Integer> map = new HashMap<>();

        String line;
        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z ]", "");
            for (String word : line.split("\\s+"))
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        br.close();

        map.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(10)
                .forEach(System.out::println);
    }
}