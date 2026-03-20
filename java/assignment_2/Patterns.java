public class Patterns {

    public static void main(String[] args) {
        int n = 5; // size of shapes

        System.out.println("1. Square");
        square(n);

        System.out.println("\n2. Rectangle");
        rectangle(n, n + 2);

        System.out.println("\n3. Parallelogram");
        parallelogram(n);

        System.out.println("\n4. Mirrored Parallelogram");
        mirroredParallelogram(n);

        System.out.println("\n5. Right Triangle");
        rightTriangle(n);

        System.out.println("\n6. Mirrored Right Triangle");
        mirroredRightTriangle(n);

        System.out.println("\n7. Isosceles Triangle (Pyramid)");
        pyramid(n);

        System.out.println("\n8. Inverted Isosceles Triangle");
        invertedPyramid(n);

        System.out.println("\n9. Diamond");
        diamond(n);
    }

    // 1. Square
    static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Rectangle
    static void rectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Parallelogram
    static void parallelogram(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Mirrored Parallelogram
    static void mirroredParallelogram(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 5. Right Triangle
    static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 6. Mirrored Right Triangle
    static void mirroredRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 7. Isosceles Triangle (Pyramid)
    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 8. Inverted Isosceles Triangle
    static void invertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9. Diamond
    static void diamond(int n) {
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}