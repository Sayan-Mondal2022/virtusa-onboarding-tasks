// Q9: Find first palindrome substring in a string.
public class FirstPalindromeSubstring {
    public static void main(String[] args) {
        String str = "abacdf";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                    return;
                }
            }
        }
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
}