import java.util.Scanner;

public class FibonacciDp {

    public static int fib(int n) {
        // 5
        // 0, 1, 1, 2, 3, 5
        if (n <= 1) {
            return n;
        }
        int nm1 = fib(n - 1);
        int nm2 = fib(n - 2);
        return nm1 + nm2;
    }

    private static int fibM(int n, int[] dp) {
        if (n <= 1) {
            return dp[n] = n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int nm1 = fib(n - 1);
        int nm2 = fib(n - 2);
        return dp[n] = nm1 + nm2;
    }

    private static int fibT(int n, int[] dp) {
        for (int i = 0; i < n + 1; i++) {
            if (n <= 1) {
                dp[i] = n;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                dp[i] = -1;
            }
            int ans = fib(n);
            int ans2 = fibT(n, dp);
            System.out.println(ans2);
        }
    }
}
