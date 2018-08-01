import java.util.*;
public class friendsPairing
{
    public static int number(int n)
    {
        int[]dp = new int[n+1];
        
        dp[0]=1;
        dp[1] = 1;
        for(int i =1;i<n;i++)
        {
            dp[i+1]=dp[i] +i*dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(number(n));

    }
}