package java.assignment1and2.src.Assignment;

public class Main{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        Dog myDog = new Dog();
        myDog.makeSound();
    }
}