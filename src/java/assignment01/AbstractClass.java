
//. Non-access Modifiers

package java.assignment01;

public abstract class AbstractClass {

    public static final int CONSTANT_VALUE = 10;  // Indicates that a variable's value cannot be changed or a method cannot be overridden

    public abstract void abstractMethod(); //Used for abstract classes and methods, which have no implementation in the class itself.

    //Indicates that a variable or method belongs to the class rather than an instance of the class.
    public static void staticMethod() {
        // Code here
    }

    //Specifies that a variable is not part of the persistent state of an object (used in serialization).
    transient int transientVariable;

    //Indicates that a variable may be changed by multiple threads simultaneously.
    volatile int volatileVariable;
}
