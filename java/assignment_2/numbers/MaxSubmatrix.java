// 17. Maximum sum submatrix

public class MaxSubmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, -2, -1, 4},
            {-8, 3, 4, 2},
            {3, 8, 10, -8},
            {-4, -1, 1, 7}
        };

        int maxSum = Integer.MIN_VALUE;

        for (int left = 0; left < matrix[0].length; left++) {
            int[] temp = new int[matrix.length];

            for (int right = left; right < matrix[0].length; right++) {

                for (int i = 0; i < matrix.length; i++)
                    temp[i] += matrix[i][right];

                int curr = temp[0], best = temp[0];
                for (int i = 1; i < temp.length; i++) {
                    curr = Math.max(temp[i], curr + temp[i]);
                    best = Math.max(best, curr);
                }

                maxSum = Math.max(maxSum, best);
            }
        }

        System.out.println("Max Submatrix Sum: " + maxSum);
    }
}