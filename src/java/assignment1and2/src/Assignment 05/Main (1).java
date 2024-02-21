package java.assignment1and2.src.Assignment

// The base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

// The first level of inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is moving");
    }
}

// The second level of inheritance
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

// The third level of inheritance
class TeslaModelS extends ElectricCar {
    void autopilot() {
        System.out.println("Tesla Model S is in autopilot mode");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the TeslaModelS class
        TeslaModelS myTesla = new TeslaModelS();


        myTesla.start();
        myTesla.drive();
        myTesla.charge();
        myTesla.autopilot();
        myTesla.stop();
    }
}
