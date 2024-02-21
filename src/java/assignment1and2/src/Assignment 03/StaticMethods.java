package java.assignment1and2.src.Assignment;

public class StaticMethods {
    private static int staticVariable = 0;

    // Non-static variable
    private int nonStaticVariable;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        // Accessing static variable is allowed
        staticVariable++;
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
        // Accessing both static and non-static variables is allowed
        staticVariable++;
        nonStaticVariable++;
    }

    // Main method (entry point for the application)
    public static void main(String[] args) {
        // Calling static method without creating an instance
        staticMethod();

        // Creating an instance of the class
        StaticMethods myObject = new StaticMethods();

        // Calling non-static method using the instance
        myObject.nonStaticMethod();

        // Accessing non-static variable through the instance
        System.out.println("Non-static variable value: " + myObject.nonStaticVariable);

        // Accessing static variable through the class
        System.out.println("Static variable value: " + StaticMethods.staticVariable);
    }
}
