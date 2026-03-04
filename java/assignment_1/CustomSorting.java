import java.util.ArrayList;
import java.util.Scanner;

class Student{
    public String id, name;
    public int marks;

    public Student(String id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "(ID: " + id + ", Name: " + name + ", Marks: " + marks + ")";
    }
}

public class CustomSorting {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("\nEnter the id: ");
            String id = sc.next();

            sc.nextLine();

            System.out.print("Enter the name: ");
            String name = sc.nextLine();

            System.out.print("Enter the marks: ");
            int marks = sc.nextInt();

            students.add(new Student(id, name, marks));
        }

        System.out.print("\n\nStudent list:\n" + students);
        
        // Sorting by marks:
        students.sort((a, b) -> a.marks - b.marks);
        System.out.print("\n\nStudent list after sorting by marks:\n" + students);
        
        students.sort((a, b) -> a.name.compareTo(b.name));
        System.out.print("\n\nStudent list after sorting by name:\n" + students);
    }
}
