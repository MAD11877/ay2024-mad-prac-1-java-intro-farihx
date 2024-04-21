public class Question5
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        
        int cnt = in.nextInt();
        
        int[] num = new int[cnt];
        
        for (int i = 0; i < cnt; i++)
        {
            num[i] = in.nextInt();
        }
        
        int mode = 0;
        int max = 0;
        
        for (int i = 0; i < cnt; i++) {
            int currentNum = num[i];
            int currentCnt = 0;
            for (int j = 0; j < cnt; j++) {
                if (num[j] == currentNum) {
                    currentCnt++;
                }
            }
            if (currentCnt > max) {
                mode = currentNum;
                max = currentCount;
            }
        }
        System.out.println(mode);
    }
}
