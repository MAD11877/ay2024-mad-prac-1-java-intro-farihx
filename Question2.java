import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    double height = in.nextDouble();
    double weight = in.nextDouble();
    double bmi = weight / (height * height);
    
    String finalbmi = String.format("%.1f", bmi);
    System.out.println(finalbmi);    
    in.close();
  }
}
