package java.assignment1and2.src.Assignment;

public class AccessModifiersExample {
    // Accessible from any other class.
    public int publicVariable;

    // Accessible within the same package and by subclasses.
    protected int protectedVariable;

    // Accessible only within the same package.
    int defaultVariable;

    // Accessible only within the same class.
    private int privateVariable;

    // Constructor
    public AccessModifiersExample() {
        this.publicVariable = 1;
        this.protectedVariable = 2;
        this.defaultVariable = 3;
        this.privateVariable = 4;
    }

    // Accessible from any other class.
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Accessible within the same package and by subclasses.
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Accessible only within the same package.
    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Accessible only within the same class.
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing variables
        System.out.println("Public variable: " + example.publicVariable);
        System.out.println("Protected variable: " + example.protectedVariable);
        System.out.println("Default variable: " + example.defaultVariable);
        System.out.println("Private variable: " + example.privateVariable);

        // Accessing methods
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }
}
