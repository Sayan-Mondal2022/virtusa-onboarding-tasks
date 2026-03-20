// Q20: If one string is substring of another, print substring and remainder.
public class SubstringRemainder {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ell";

        if (s1.contains(s2)) {
            System.out.println("Substring: " + s2);
            System.out.println("Remainder: " + s1.replaceFirst(s2, ""));
        }
    }
}