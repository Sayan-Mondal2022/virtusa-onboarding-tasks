// Q13: Reverse each word in a sentence.
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";

        for (String word : str.split(" ")) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--)
                rev += word.charAt(i);
            System.out.print(rev + " ");
        }
    }
}