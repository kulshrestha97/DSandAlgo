import java.util.*;

public class fibbonacciRev {
    public static int[] fibRev(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = fibRev(n);
        while (n-- > 0) {
            System.out.print(arr[n] + " ");
        }
        

    }
}