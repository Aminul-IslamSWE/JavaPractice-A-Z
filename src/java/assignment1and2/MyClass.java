package java.assignment1and2;

public class MyClass {

    private String name;
    private int age;

    // Constructor
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Creating an instance of the class
        MyClass myInstance = new MyClass("aminul Islam Raju", 24);

        // Calling the method on the instance
        myInstance.displayInfo();
    }
}
