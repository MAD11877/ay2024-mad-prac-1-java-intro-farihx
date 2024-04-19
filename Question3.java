import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = multiplyByItself(num);
        System.out.println(result);
    }
    public static int multiplyByItself(int num) {
        return num * num;
    }
}
