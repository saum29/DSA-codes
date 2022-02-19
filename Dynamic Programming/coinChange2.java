import java.util.Scanner;

public class coinChange2 {
    private static int coinChangeMin2(int[] coins, int total) {
        int n = coins.length;
        int[][] t = new int[n + 1][total + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < total + 1; j++) {
                if (i == 0) {
                    t[i][j] = Integer.MAX_VALUE - 1;
                }
                if (j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < total + 1; j++) {
                if (coins[i - 1] <= j) {
                    t[i][j] = Math.min(1 + t[i][j - coins[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }

            }
        }
        if (t[n][total] == Integer.MAX_VALUE - 1) {
            return -1;
        }
        return t[n][total];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int ans = coinChangeMin2(arr, sum);
        System.out.println(ans);
    }

}
