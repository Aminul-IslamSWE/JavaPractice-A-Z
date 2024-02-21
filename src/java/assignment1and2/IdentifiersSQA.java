package java.assignment1and2;

public class IdentifiersSQA {
    int age = 24;

    public void printAge() {
        System.out.println("My age is " + age);
    }

    public static void main(String[] args) {
        IdentifiersSQA sqa = new IdentifiersSQA();
        sqa.printAge();
    }
}