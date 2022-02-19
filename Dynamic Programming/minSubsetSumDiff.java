import java.util.Scanner;

public class minSubsetSumDiff {
    private static int minSubsetSum(int[] arr, int n) {
        int range = 0;
        for (int i = 0; i < n; i++) {
            range += arr[i];
        }
        boolean[][] t = new boolean[n + 1][range + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < range + 1; j++) {
                
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < range + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        int diff = Integer.MAX_VALUE;

        // Find the largest j such that dp[n][j]
        // is true where j loops from sum/2 t0 0
        for (int j = range / 2; j >= 0; j--) {
            // Find the
            if (t[n][j] == true) {
                diff = range - 2 * j;
                break;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = minSubsetSum(arr, n);
        System.out.println(ans);
    }
}
