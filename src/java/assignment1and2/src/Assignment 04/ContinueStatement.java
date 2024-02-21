package java.assignment1and2.src.Assignment;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {



            if (i == 3) {
                System.out.println("Skipping I=3");
                continue;
            }
            System.out.println("count is :" +i);
        }
    }
}
