package java.assignment1and2.src.Assignment;

public class getterMethods {
    public static class Person {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter method for the 'name' variable
        public String getName() {
            return name;
        }

        // Getter method for the 'age' variable
        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person("Aminul Islam Raju", 25);

        // Using the getter methods to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
