import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = size; i > 0; i--) {
            // Loop to control columns
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
