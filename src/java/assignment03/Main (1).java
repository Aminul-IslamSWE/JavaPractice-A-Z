package java.assignment03;

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