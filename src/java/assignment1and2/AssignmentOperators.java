package java.assignment1and2;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 5, y = 3;
        System.out.println("Assignment Operators:");
        x += y; // Equivalent to x = x + y
        System.out.println("+= : " + x);

        x -= y; // Equivalent to x = x - y
        System.out.println("-= : " + x);

        x *= y; // Equivalent to x = x * y
        System.out.println("*= : " + x);
        x /= y; // Equivalent to x = x / y

        System.out.println("/= : " + x);
        x %= y; // Equivalent to x = x % y
        System.out.println("%= : " + x);
    }

}