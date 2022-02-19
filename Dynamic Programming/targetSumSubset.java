import java.util.Scanner;

public class targetSumSubset {

    private static int subsetGivenDiff(int[] arr, int n, int target) {
        int sum_arr = 0;
        for (int i = 0; i < n; i++) {
            sum_arr += arr[i];
        }
        int sum = (target + sum_arr) / 2;
        return countSubsetGivenSum(arr, n, sum);
    }

    private static int countSubsetGivenSum(int[] arr, int n, int sum) {
        int[][] t = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
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
        int target = sc.nextInt();

        int ans = subsetGivenDiff(arr, n, target);
        System.out.println(ans);
    }
}
