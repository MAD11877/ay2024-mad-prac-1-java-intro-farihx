import java.util.Scanner;

public class Question5 {
    public static void main(String[] args)
    {
       
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++)
        {
            numbers[i] = in.nextInt();
        }
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < count; i++)
        {
            int currentNumber = numbers[i];
            int currentCount = 0;
            for (int j = 0; j < count; j++)
            {
                if (numbers[j] == currentNumber)
                {
                    currentCount++;
                }
            }
            if (currentCount > maxCount)
            {
                mode = currentNumber;
                maxCount = currentCount;
            }
        }
        System.out.println(mode);
    }
}
//print
