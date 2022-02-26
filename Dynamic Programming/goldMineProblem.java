import java.util.Scanner;

public class goldMineProblem {

    private static int goldMine(int[][] mat, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int j = m - 1; j >= 0; j--) {
            for (int i = 0; i <= n - 1; i++) {
                if (j == m - 1) {
                    dp[i][j] = mat[i][j];
                } else if (i == 0) {
                    dp[i][j] = mat[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == n - 1) {
                    dp[i][j] = mat[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = mat[i][j] + Math.max(Math.max(dp[i][j + 1], dp[i - 1][j + 1]), dp[i + 1][j + 1]);
                }
            }
        }
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n + 1; i++) {
            if (dp[i][0] > maxi) {
                maxi = dp[i][0];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int ans = goldMine(mat, n, m);
        System.out.println(ans);
    }
}
