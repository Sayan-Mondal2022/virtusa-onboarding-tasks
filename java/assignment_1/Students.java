/*
    Write a program to:
        -> Store student names in an ArrayList.
        -> Sort them alphabetically.
        -> Display the sorted list.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int size = sc.nextInt();
        
        List<String> names = new ArrayList<String>();

        for (int i = 0; i < size; i++){
            System.out.print("Enter the name: ");
            String name = sc.next();

            names.add(name);
        }

        System.out.println("\nNames before sorting\n" + names);
        names.sort(null);
        System.out.println("\nNames after sorting\n" + names);
    }
}
