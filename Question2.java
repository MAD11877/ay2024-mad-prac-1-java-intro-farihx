import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your height (m): ");
        double h = in.nextDouble();
        
        System.out.print("Enter your weight (kg): ");
        double w = in.nextDouble();
        
        double bmi = w / (h * h);
        
        System.out.println("Wazoo, your BMI is: " + bmi);
    }
}
