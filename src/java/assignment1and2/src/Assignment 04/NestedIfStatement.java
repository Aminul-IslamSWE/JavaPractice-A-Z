package java.assignment1and2.src.Assignment;
public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 17;
        boolean hasLicense = true;

        if (age >= 18) {
            System.out.println("Person is eligible to vote");

            if (hasLicense) {
                System.out.println("Person can drive");
            } else {
                System.out.println("Person cannot drive without a license");
            }

        } else {
            System.out.println("Person is not eligible to vote");
        }
    }
}
