import java.util.*;

public class climbStairs {
    public static int climbingStairs(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        if (n - 1 >= 0) {
            count += climbingStairs(n - 1);
        }
        if (n - 2 >= 0) {
            count += climbingStairs(n - 2);
        }
        if (n - 3 >= 0) {
            count += climbingStairs(n - 3);
        }

        return count;
    }

    public static int climbingStairsM(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        if (n == 0) {
            return dp[n] = 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int count = 0;
        if (n - 1 >= 0) {
            count += climbingStairs(n - 1);
        }
        if (n - 2 >= 0) {
            count += climbingStairs(n - 2);
        }
        if (n - 3 >= 0) {
            count += climbingStairs(n - 3);
        }

        return dp[n] = count;
    }

    public static int climbingStairsT(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        for (int i = 0; i < dp.length; i++) {
            if (i == 0) {
                dp[i] = 1;
                continue;
            }
            if (dp[i] != -1) {
                return dp[i];
            }

            int count = 0;

            if (i - 1 >= 0) {
                count += dp[i - 1];
            }
            if (i - 2 >= 0) {
                count += dp[i - 2];
            }
            if (i - 3 >= 0) {
                count += dp[i - 3];
            }
            dp[i] = count;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = climbingStairsT(n);
            System.out.println(ans);
        }
    }
}
