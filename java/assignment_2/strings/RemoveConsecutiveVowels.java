// Q4: Eliminate more than 1 consecutive vowel.
public class RemoveConsecutiveVowels {
    public static void main(String[] args) {
        String str = "coooool";
        String result = "";
        boolean prevVowel = false;

        for (char c : str.toCharArray()) {
            boolean isVowel = "aeiouAEIOU".indexOf(c) != -1;

            if (!(isVowel && prevVowel)) {
                result += c;
            }

            prevVowel = isVowel;
        }

        System.out.println(result);
    }
}