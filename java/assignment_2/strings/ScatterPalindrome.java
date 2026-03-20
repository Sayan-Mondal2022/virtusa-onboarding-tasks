// Q21: Print all scatter (anagram-based) palindromes.
import java.util.*;

public class ScatterPalindrome {
    public static void main(String[] args) {
        String str = "aab";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int odd = 0;
        for (int val : map.values())
            if (val % 2 != 0) odd++;

        if (odd > 1)
            System.out.println("No scatter palindrome");
        else
            System.out.println("Scatter palindrome possible");
    }
}