// Q3: Remove vowels from a given string.

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";

        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) == -1)
                result += c;
        }

        System.out.println(result);
    }
}