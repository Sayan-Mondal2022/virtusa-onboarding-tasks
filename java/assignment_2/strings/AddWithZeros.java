// Q15: Add 2 numbers and pad with leading zeros.
public class AddWithZeros {
    public static void main(String[] args) {
        int a = 45, b = 55;
        int sum = a + b;

        String result = String.valueOf(sum);
        int size = 5;

        while (result.length() < size)
            result = "0" + result;

        System.out.println(result);
    }
}