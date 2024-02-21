package java.assignment1and2.src.Assignment;

public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        // You can't access instance variables directly from a static context
        // Instead, you need to create an instance of the class
        Person person = new Person();

        // Initialize the instance variables
        person.name = "John";
        person.age = 30;

        // Display the person's details
        person.display();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
