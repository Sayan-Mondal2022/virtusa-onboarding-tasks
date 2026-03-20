// Q1: Print alternate characters in a given string with a space between them.
public class AlternateChars {
    public static void main(String[] args) {
        String str = "HELLO";

        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}