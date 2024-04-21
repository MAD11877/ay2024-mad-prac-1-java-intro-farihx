import java.util.Scanner;

public class Question5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int cnt = in.nextInt();

        int[] num = new int[count];

        System.out.println("Enter integers:");
        for (int i = 0; i < cnt; i++)
        {
            num[i] = in.nextInt();
        }
        
        int mode = 0;
        int maxFreq = 0;
        
        for (int i = 0; i < cnt; i++)
        {
            int freq = 0;
            for (int j = 0; j < cnt; j++)
            {
                if (num[i] == num[j])
                {
                    freq++;
                }
            }
            if (freq > maxFreq)
            {
                mode = num[i];
                maxFreq = freq;
            }
        }

        System.out.println("Mode: " + mode);
    }
}
