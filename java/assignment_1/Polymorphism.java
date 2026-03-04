/*
    Java program demonstrate all four pillars
        -> Polymorphism
*/

class Animal{
    public String name;
    public int age;

    // Non-Parametrized constructor
    public Animal(){
        // Using this() -> to call the Parameterized constructor
        this("Unknown", 10);

        // System.out.println("Non-Parametrized constructor is called in Animal Class");
    }

    // Parameterized constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;

        // System.out.println("Parameterized constructor is called in Animal Class");
    }

    public void display(){
        System.out.println("Animal name is: " + this.name + "\nAnimal age is: " + this.age);
    }

    public static void show(){
        System.out.println("Parent class show() method is called");
    }

    final void greet(){
        System.out.println("Greetings from Parent class");
    }
}

class Cat extends Animal{
    public Cat(){
        super();
        // System.out.println("Child Class Constructor is called");
    }

    public Cat(String name, int age){
        super(name, age);
    }

    // This is a example of method overriding
    @Override
    public void display() {
        System.out.printf("Cat name is: %s\nAge is: %d\nChild Class method is called\n", this.name, this.age);
    }

    // Can't override the static method, as static methods are hidden.
    public static void show(){
        System.out.println("Child class show() method is called");
    }

    /*
        will get an error:
        error: greet() in Cat cannot override greet() in Animal
    */
    // void greet(){
    //     System.out.println("Greetings from Child class");
    // }

    
}

// This is a class to show Method Overloading.
class Sample{
    // Example for Compile-Time Polymorphism:
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        // Creating a instance of Animal class
        System.out.println("Example for Constructor Overloading");
        Animal obj1 = new Animal();
        obj1.display();

        Animal obj2 = new Animal("Dog", 2);
        obj2.display();

        System.out.println("\n\nExample for Method Overriding");
        Animal obj3 = new Cat();
        obj3.display();
        
        Animal obj4 = new Cat("Tom", 5);
        obj4.display();
        // obj4.show();
        // obj4.greet();

        Sample obj5 = new Sample();
        System.out.println("\n\nExample for Method Overloading");
        System.out.println("Value is:" + obj5.add(5,10));
        System.out.println("Value is:" + obj5.add(5,10.5));
        System.out.println("Value is:" + obj5.add(5,10, 20));
    }
}
