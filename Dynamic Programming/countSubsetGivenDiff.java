import java.util.Scanner;

public class countSubsetGivenDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = sc.nextInt();
        int ans = countSubsetWithGivenDiff(arr, n, diff);
        System.out.println(ans);
    }

    private static int countSubsetWithGivenDiff(int[] arr, int n, int diff) {
        int arrsum = 0;
        for (int i = 0; i < n; i++) {
            arrsum += arr[i];
        }
        int sum = (diff + arrsum) / 2;
        int count = countSubsetWithGivenSum(arr, n, sum);
        return count;
    }

    private static int countSubsetWithGivenSum(int[] arr, int n, int sum) {
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
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] + t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}
