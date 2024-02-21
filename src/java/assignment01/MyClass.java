
//Access Modifiers:

package java.assignment01;

public class MyClass {

    public int publicVariable; //Accessible from any other class.
    protected int protectedVariable; //Accessible within the same package and by subclasses.
    int defaultVariable; //Accessible only within the same package.
    private int privateVariable; //Accessible only within the same class.

    public void publicMethod() {
        // Code here
    }

    protected void protectedMethod() {
        // Code here
    }

    void defaultMethod() {
        // Code here
    }

    private void privateMethod() {
        // Code here
    }
}