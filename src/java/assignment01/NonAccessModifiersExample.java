package java.assignment01;

public class NonAccessModifiersExample {
    // Final modifier: indicates that a variable's value cannot be changed.
    public static final int CONSTANT_VALUE = 10;

    // Abstract modifier: used for abstract classes and methods (no implementation in the class).
    public abstract static class AbstractClass {
        public abstract void abstractMethod();
    }

    // Static modifier: indicates that a variable or method belongs to the class rather than an instance.
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Transient modifier: specifies that a variable is not part of the persistent state of an object (used in serialization).
    transient int transientVariable;

    // Volatile modifier: indicates that a variable may be changed by multiple threads simultaneously.
    volatile int volatileVariable;

    public static void main(String[] args) {
        NonAccessModifiersExample example = new NonAccessModifiersExample();

        // Accessing final constant
        System.out.println("Constant value: " + NonAccessModifiersExample.CONSTANT_VALUE);

        // Accessing static method
        NonAccessModifiersExample.staticMethod();

        // Accessing transient and volatile variables
        System.out.println("Transient variable: " + example.transientVariable);
        System.out.println("Volatile variable: " + example.volatileVariable);
    }

}
