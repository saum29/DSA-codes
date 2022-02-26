import java.util.Scanner;

public class minCostMazeTraversal {
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
        int ans = minCostInMaze(mat, n - 1, m - 1);
        System.out.println(ans);
    }

    private static int minCostInMaze(int[][] mat, int r, int c) {
        int[][] dp = new int[r + 1][c + 1];
        for (int i = r; i >= 0; i--) {
            for (int j = c; j >= 0; j--) {
                if (i == r && j == c) {
                    dp[i][j] = mat[i][j];
                } else if (i == r) {
                    dp[i][j] = mat[i][j] + dp[i][j + 1];
                } else if (j == c) {
                    dp[i][j] = mat[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + mat[i][j];
                }
            }
        }
        return dp[0][0];
    }
}
