package java.assignment1and2.src.Assignment

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("Aminul Islam", 25);
        Person person2 = new Person("Raju", 30);

        // Accessing and modifying object properties
        person1.displayInfo();
        person2.displayInfo();

        // Modifying age for person1
        person1.age = 26;

        // Displaying updated information
        person1.displayInfo();
    }
}
