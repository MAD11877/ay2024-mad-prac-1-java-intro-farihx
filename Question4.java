import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int baseLength = in.nextInt();

    for (int i = baseLength; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    in.close();
  }
}
