// Question: Convert list of objects to map
package assignment_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ListToMap {
    public static void main(String[] args) {
        /*
         * Sample Input: 
         * Person(1, "Alice")
         * Person(2, "Bob")
         * Person(3, "Charlie")
         * 
         * Expected Output: 
         * 1 -> Alice
         * 2 -> Bob
         * 3 -> Charlie
         */
        List<Person> people = Arrays.asList(
            new Person(1, "Alice"),
            new Person(2, "Bob"),
            new Person(3, "Charlie")
        );
        
        Map<Integer, String> personMap = people.stream()
            .collect(Collectors.toMap(Person::getId, Person::getName));
            
        personMap.forEach((id, name) -> System.out.println(id + " -> " + name));
    }
}
