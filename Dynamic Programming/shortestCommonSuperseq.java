import java.util.Scanner;

public class shortestCommonSuperseq {

    private static int SCS(char[] x, char[] y, int m, int n) {
        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
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
        int lcs = t[m][n];
        return m + n - lcs;
    }

    private static int LCS(char[] x, char[] y, int m, int n) {
        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
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
        int lcs = t[m][n];
        return lcs;
    }

    private static int minInsDel(char[] x, char[] y, int m, int n) {
        int del = m - LCS(x, y, m, n);
        int ins = n - LCS(x, y, m, n);
        return del + ins;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int m = sc.nextInt();
        int n = sc.nextInt();

        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();

        int ans = SCS(x, y, m, n);
        int ans2 = minInsDel(x, y, m, n);
        System.out.println();
    }
}
