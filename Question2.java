import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();
        double weight = in.nextDouble();
        double bmi = calculateBMI(height, weight);
        System.out.println(bmi);
    }

    // Method to calculate BMI
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
