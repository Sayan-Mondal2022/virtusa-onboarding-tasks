// Q19: Match substring using regex with *
public class RegexMatch {
    public static void main(String[] args) {
        String str = "Bombay";
        String pattern = "om.*";

        for (int i = 0; i < str.length(); i++) {
            String sub = str.substring(i);
            if (sub.matches(pattern)) {
                System.out.println(sub);
                break;
            }
        }
    }
}