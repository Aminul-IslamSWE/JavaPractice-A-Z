package java.assignment04;
// Step 1: Define an interface or abstract class
interface MyInterface {
    void method1();
    void method2();
}

// Step 2: Implement the interface in a concrete class
class MyClass implements MyInterface {
    @Override
    public void method1() {
        System.out.println("Inside method1 implementation in MyClass");
    }

    @Override
    public void method2() {
        System.out.println("Inside method2 implementation in MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        //  Declare a variable of the interface type
        MyInterface variable;

        // Assign an instance of the concrete class to the interface variable
        variable = new MyClass();

        // Now you can call methods on the variable, and the implementations from MyClass will be invoked.
        variable.method1(); // Output: Inside method1 implementation in MyClass
        variable.method2(); // Output: Inside method2 implementation in MyClass
    }
}

