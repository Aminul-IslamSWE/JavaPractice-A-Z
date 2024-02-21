package java.assignment01;

public class MyClass {
    // Instance variable
    private int value;

    // Constructor
    public MyClass(int value) {
        this.value = value;
    }

    // Instance method
    public void displayValue() {
        System.out.println("The current value is " + this.value);
    }

    // Another instance method that modifies the instance variable
    public void setValue(int newValue) {
        this.value = newValue;
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        MyClass obj = new MyClass(42);

        // Calling instance methods
        obj.displayValue();  // Output: The current value is 42

        // Modifying the instance variable
        obj.setValue(100);

        // Calling the method again to see the updated value
        obj.displayValue();  // Output: The current value is 100
    }
}

