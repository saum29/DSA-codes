import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubstring {

    private static int Lcs(char[] X, char[] Y, int m, int n) {
        int[][] t = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {

                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }

                else if (X[i - 1] == Y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                }

                else {
                    t[i][j] = 0;
                }
            }
        }

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                maxi = Math.max(maxi, t[i][j]);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();

        int m = s1.length();
        int n = s2.length();

        int ans = Lcs(X, Y, m, n);
        System.out.println(ans);
    }
}
