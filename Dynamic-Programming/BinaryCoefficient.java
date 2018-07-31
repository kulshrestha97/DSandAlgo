import java.util.*;

public class BinaryCoefficient {
    public static int number(int n, int k) {
        // For this problem we are taking Dynamic Programming
        int[][] dp = new int[n + 1][n + 1];
        dp[n][0] = 1;
        dp[n][n] = 1;
        for (int i = 0; i < n + 1; i++) {
            // Base Cases.
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                // Building the problem.
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(number(n, k));
    }
}