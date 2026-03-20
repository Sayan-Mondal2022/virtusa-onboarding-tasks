// Q14: Prepend 0s to make string length fixed.
public class PrependZeros {
    public static void main(String[] args) {
        String num = "123";
        int length = 6;

        while (num.length() < length)
            num = "0" + num;

        System.out.println(num);
    }
}