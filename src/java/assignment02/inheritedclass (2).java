package java.assignment02;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Derived class 1
class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammal is giving birth");
    }
}

// Derived class 2
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}

// Derived class 3
class Reptile extends Animal {
    void crawl() {
        System.out.println("Reptile is crawling");
    }
}

public class Main {
    public static void main(String[] args) {
        Mammal dog = new Mammal();
        Bird eagle = new Bird();
        Reptile snake = new Reptile();

        // Mammal specific behavior
        dog.giveBirth();
        // Animal behaviors inherited by Mammal
        dog.eat();
        dog.sleep();

        // Bird specific behavior
        eagle.fly();
        // Animal behaviors inherited by Bird
        eagle.eat();
        eagle.sleep();

        // Reptile specific behavior
        snake.crawl();
        // Animal behaviors inherited by Reptile
        snake.eat();
        snake.sleep();
    }
}

