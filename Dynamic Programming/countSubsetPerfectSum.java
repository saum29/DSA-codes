import java.util.Scanner;

public class countSubsetPerfectSum {
    private static int countSubset(int[] arr, int n, int sum) {
        int mod = (int) (Math.pow(10, 9) + 7);// mentioned in Q
        int[][] t = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {// to handle {0.0.0.0.1}testcase
                if (arr[i - 1] <= j) {
                    t[i][j] = ((t[i - 1][j - arr[i - 1]] % mod) + (t[i - 1][j] % mod)) % mod;
                } else {
                    t[i][j] = (t[i - 1][j] % mod);
                }
            }
        }

        return t[n][sum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int ans = countSubset(arr, n, sum);
        System.out.println(ans);
    }
}
