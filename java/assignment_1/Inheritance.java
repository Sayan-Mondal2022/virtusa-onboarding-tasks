/*
    Java program demonstrate all four pillars
        -> Inheritance

*/

class Animal{
    public String name;
    public int age;

    Animal(){
        this("Unknown", 1);
        System.out.println("This is Animal class (Base Class)");
    }

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void display(){
        System.out.println("Animal name: " + this.name + " age is: " + this.age);
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("This is Dog class (Child class inheriting the properties of Base class)");
    }

    Dog(String name, int age){
        super(name, age);
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog{
    Puppy(){
        System.out.println("This is Puppy class Inherited properties from Dog class");
    }

    Puppy(String name, int age){
        super(name, age);   // calls Dog -> Animal constructor
    }

    public void weep(){
        System.out.println("Puppy is weeping");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("This is a cat class inherited from Animal class");
    }

    public void sound(){
        System.out.println("Cat is meowing");
    }
}


interface Walker{
    void walk();
}

interface Swimmer{
    void swim();
}

class Duck implements Walker, Swimmer{

    public void walk(){
        System.out.println("Duck can walk");
    }

    public void swim(){
        System.out.println("Duck can swim");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Example for Single Inheritance: Inheriting from a single base class.
        System.out.println("\n\nExample for SINGLE INHERITANCE");
        // Dog obj = new Dog();   
        Dog obj = new Dog("Tommy", 5);   
        
        // Can access the Parent class methods and instance variables as well.
        obj.display();
        obj.sleep();
        obj.bark();
        
        
        // Hierarchical Inheritance, Multiple sub-classes inherits from a single parent class.
        System.out.println("\n\nExample for HIERARCHICAL INHERITANCE");
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        
        System.out.println("Dog class calling display()");
        obj1.display();
        
        System.out.println("Cat class calling display()");
        obj2.display();
        
        
        // Multilevel Inheritance: Animal -> Dog -> Puppy
        System.out.println("\n\nExample for MULTILEVEL INHERITANCE");
        Puppy obj3 = new Puppy("Bruno", 1);
        
        obj3.display();  // from Animal
        obj3.sleep();    // from Animal
        obj3.bark();     // from Dog
        obj3.weep();     // from Puppy
        
        
        // Multiple Inheritance: Inheriting from Multiple classes, by default java doesn't allow this due to Diamond Problem. So we use Interfaces to implement this
        System.out.println("\n\nExample for MULTIPLE INHERITANCE");
        Duck obj4 = new Duck();

        obj4.walk();
        obj4.swim();
    }
}
