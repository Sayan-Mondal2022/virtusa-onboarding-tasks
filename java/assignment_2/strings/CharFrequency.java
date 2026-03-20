// Q10: Frequency of each character in a string.
import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        System.out.println(map);
    }
}