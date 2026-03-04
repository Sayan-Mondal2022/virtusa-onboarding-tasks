// Write a program to find common elements between two HashSet.

import java.util.Set;
import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        // Initializing two sets
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        System.out.print("Elements in set1: " + set1);
        System.out.print("\nElements in set2: " + set2);

        System.out.print("\nCommon Elements are: ");
        for (int n: set1) {
            if (set2.contains(n))
                System.out.print(n + " ");
        }
    }
}
