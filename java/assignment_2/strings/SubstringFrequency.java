// Q11: Frequency of a substring in a string.
public class SubstringFrequency {
    public static void main(String[] args) {
        String str = "ababab";
        String sub = "ab";
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                count++;
        }

        System.out.println(count);
    }
}