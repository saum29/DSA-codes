import java.util.*;

public class LongestCommonSubsequence {
    private static int LCS(char[] x, char[] y, int m, int n) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (x[m - 1] == y[n - 1]) {
            return 1 + LCS(x, y, m - 1, n - 1);
        } else {
            return Math.max(LCS(x, y, m - 1, n), LCS(x, y, m, n - 1));
        }
    }

    private static int LCS_memoized(char[] x, char[] y, int m, int n) {
        int[][] t = new int[m + 1][n + 1];
        for (int[] row : t)
            Arrays.fill(row, -1);

        if (n == 0 || m == 0) {
            return 0;
        }
        if (t[m][n] != -1) {
            return t[m][n];
        }
        if (x[m - 1] == y[n - 1]) {
            return t[m][n] = 1 + LCS(x, y, n - 1, m - 1);
        } else {
            return t[m][n] = Math.max(LCS(x, y, m - 1, n), LCS(x, y, m, n - 1));
        }
    }

    private static int LCS_Tabulation(char[] x, char[] y, int m, int n) {
        int[][] t = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }

                else if (x[i - 1] == y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                }

                else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        StringBuilder s = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (x[i - 1] == y[j - 1]) {
                s.append(x[i - 1]);
                i--;
                j--;
            } else {
                if (t[i][j - 1] > t[i - 1][j])
                    j--;
                else
                    i--;
            }
        }

        System.out.println(s.reverse().toString());

        return t[m][n];
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            char[] X = s1.toCharArray();
            char[] Y = s2.toCharArray();

            int m = s1.length();
            int n = s2.length();

            int ans = LCS(X, Y, m, n);
            int ans2 = LCS_memoized(X, Y, m, n);
            int ans3 = LCS_Tabulation(X, Y, m, n);
            System.out.println(ans);
            System.out.println(ans2);
            System.out.println(ans3);
        }
    }
}
