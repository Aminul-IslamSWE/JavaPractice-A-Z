package java.assignment1and2.src.Assignment;

public class breakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count is: " + i);

            // Break the loop when i is equal to 3
            if (i == 3) {
                System.out.println("Breaking the loop");
                break;
            }
        }
    }
}
