import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        //Scanner in = new Scanner(System.in);
        //double height = in.nextDouble();
        //double weight = in.nextDouble();
        
        double height = 1.585;
        double weight = 52;
        
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}
