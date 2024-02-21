package java.assignment02;

// Base class
class Vehicle {
    String brand;

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int wheels;

    void displayWheels() {
        System.out.println("Number of wheels: " + wheels);
    }
}


class ElectricCar extends Car {
    String batteryType;

    void displayBatteryType() {
        System.out.println("Battery Type: " + batteryType);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of ElectricCar
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.brand = "Hybrid Hyndai";
        myElectricCar.wheels = 1000;
        myElectricCar.batteryType = "Walton";

        // Calling methods from the inherited classes
        myElectricCar.displayBrand();
        myElectricCar.displayWheels();
        myElectricCar.displayBatteryType();
    }
}
