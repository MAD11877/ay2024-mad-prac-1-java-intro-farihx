import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] numbers = new int[n];

    for (int i = 0; i < n; i++) {
      numbers[i] = in.nextInt();
    }

    int mode = numbers[0];
    int maxCount = 0;

    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (numbers[j] == numbers[i]) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        mode = numbers[i];
      }
    }

    System.out.println(mode);
    in.close();
  }
}
