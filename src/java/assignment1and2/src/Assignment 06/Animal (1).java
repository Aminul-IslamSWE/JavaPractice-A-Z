package java.assignment1and2.src.Assignment;

public class Animal {
    void makeSound(){
        System.out.println("Some generic sound");
    }
}

//overloading
class Dog extends Animal {

    void makeSound(){
        System.out.println("Woof");
    }

    void makeSound(int count){ //ovveride
        for (int i = 0; i < count; i++) {
            System.out.println("Woof");
        }
    }
}

class Cat extends Animal{
    void makeSound(){   //ovveride
        System.out.println("Meow");
    }
}
