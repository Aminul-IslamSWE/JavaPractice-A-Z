package java.assignment1and2.src.Assignment;

public class SetterMethods {

    public static class Person {
        private String name;
        private int age;

        // Constructor with initial values
        public Person(String name, int age) {
            this.name = name;
            setAge(age);  // Use the setter method to handle validation
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Setter methods
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            if (age >= 0) {  // Add validation if needed
                this.age = age;
            } else {
                System.out.println("Age cannot be negative. Defaulting to 0.");
                this.age = 0;  // Set age to a default value or handle it accordingly
            }
        }
    }

    public static void main(String[] args) {
        // Using the constructor to set initial values
        Person person = new Person("Aminul Islam", 25);

        // Using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Using setter methods to modify the values
        person.setName("Razu");
        person.setAge(30);

        // Using getter methods again to retrieve modified values
        System.out.println("Modified Name: " + person.getName());
        System.out.println("Modified Age: " + person.getAge());
    }
}
