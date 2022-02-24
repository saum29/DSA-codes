import java.util.Scanner;

public class longestPalindromicSubsequence {

    private static int LPS(char[] x, char[] y, int n) {
        int[][] t = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (x[i - 1] == y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[n][n];
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            int n = s1.length();

            String s2 = "";
            for (int i = 0; i < n; i++) {
                s2 += s1.charAt(i);
            }

            char[] x = s1.toCharArray();
            char[] y = s2.toCharArray();

            int ans = LPS(x, y, n);
            System.out.println(ans);
        }
    }

}
