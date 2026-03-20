// Q6: Divide a string into sets of substrings with 3 characters each.
public class SubstringOfThree {
    public static void main(String[] args) {
        String str = "ABCDEFGHI";

        for (int i = 0; i < str.length(); i += 3) {
            System.out.println(str.substring(i, Math.min(i + 3, str.length())));
        }
    }
}