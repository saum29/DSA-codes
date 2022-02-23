import java.util.Scanner;

public class RodCuttingProblem {
    private static int cutRod(int[] price, int N) {
        int n = price.length;
        int[] len = new int[n];
        for (int i = 1; i <= n; i++) {
            len[i] = i;
        }
        int[][] t = new int[n + 1][N + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }

                else if (len[i - 1] <= j) {
                    t[i][j] = Math.max(price[i-1] + t[i][j - len[i - 1]], t[i - 1][j]);
                }

                else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        int ans = cutRod(price, N);
        System.out.println(ans);
    }
}
