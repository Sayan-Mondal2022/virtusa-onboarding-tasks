// Write a program to remove elements greater than 50 from a TreeSet.

import java.util.TreeSet;
import java.util.Scanner;

public class GreaterElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        System.out.print("Enter the number of Integers to enter: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            treeSet.add(num);
        }

        System.out.print("The elements in the tree set are: " + treeSet);
        
        treeSet.tailSet(50).clear();

        System.out.print("\nThe elements in the tree set after change are: " + treeSet);
    }   
}