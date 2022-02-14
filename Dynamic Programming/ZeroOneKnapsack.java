import java.util.*;

public class ZeroOneKnapsack {

    public static int knapsackR(int[] val, int[] wt, int W, int n) {
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] <= W)
            return Math.max(val[n - 1] + knapsackR(val, wt, W - wt[n - 1], n - 1), knapsackR(val, wt, W, n - 1));

        else
            return knapsackR(val, wt, W, n - 1);

    }

    public static int knapsackM(int[] val, int[] wt, int W, int n, int[][] dp) {
        if (n == 0 || W == 0)
            return 0;

        if (dp[n][W] != 0)
            return dp[n][W];

        if (wt[n - 1] <= W)
            return dp[n][W] = Math.max(val[n - 1] + knapsackM(val, wt, W - wt[n - 1], n - 1, dp),
                    knapsackM(val, wt, W, n - 1, dp));

        else
            return dp[n][W] = knapsackM(val, wt, W, n - 1, dp);
    }

    public static int knapsackT(int[] val, int[] wt, int W, int n, int[][] dp) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }

                else if (wt[i - 1] <= j)
                    dp[i][j] = Integer.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);

                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        int W = sc.nextInt();

        int dp[][] = new int[n + 1][W + 1];

        int maxProfit = knapsackT(val, wt, W, n, dp);
        System.out.println(maxProfit);
    }
}
