// Write a program to reverse a LinkedList.

import java.util.LinkedList;

public class ReverseLinkedList {

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list){
        return list.reversed();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.print("Linked list before reversing: ");
        System.out.println(list);
        
        LinkedList<Integer> newList = reverseList(list);
        System.out.print("\nLinked list before reversing: ");
        System.out.println(newList);
    }   
}
