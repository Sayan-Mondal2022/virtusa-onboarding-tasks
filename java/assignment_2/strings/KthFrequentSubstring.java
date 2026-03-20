// Q16: Kth frequently occurring substring.
import java.util.*;

public class KthFrequentSubstring {
    public static void main(String[] args) {
        String str = "banana";
        int k = 2;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
            }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println(list.get(k - 1));
    }
}