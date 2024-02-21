package java.assignment1and2;

public class HelloTest {

    public static void main(String[] args) {
        System.out.println("Hello World Aminul Islam Raju");

        SecondClass secondObject = new SecondClass();
        secondObject.displayMessage();
    }

}

// Second class
class SecondClass {
    void displayMessage() {
        System.out.println("Hello from the second class!");
    }
}