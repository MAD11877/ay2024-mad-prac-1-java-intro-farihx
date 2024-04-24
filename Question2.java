import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();
        in.nextLine();
        double weight = in.nextDouble();
        double bmi = weight / (height * height);
        //System.out.print(bmi)
    }
}
