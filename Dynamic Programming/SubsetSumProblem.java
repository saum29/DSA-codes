import java.util.*;

public class SubsetSumProblem {

    private static boolean subsetSum(int[] arr, int n, int sum, boolean[][] t) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = (t[i - 1][j - arr[i - 1]] || t[i - 1][j]);
                }

                else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }

    public static boolean subsetSumRecursive(int[] arr, int n, int sum, boolean[][] t){
        if(n == 0){
            return false;
        }
        if(sum == 0){
            return true;
        }
        if(arr[n-1]<=sum){
            return (subsetSumRecursive(arr,n-1,sum-arr[n-1],t) || subsetSumRecursive(arr,n-1,sum,t));
        }
        else
            return subsetSumRecursive(arr,n-1,sum,t);
    }

    public static boolean subsetSumRecursiveMem(int[] arr, int n, int sum, boolean[][] t){
        if(n == 0){
            return false;
        }
        if(sum == 0){
            return true;
        }

        if(t[n][sum])
            return t[n][sum];

        if(arr[n-1]<=sum){
            return (t[n-1][sum-arr[n-1]] || t[n-1][sum]);
        }
        else
            return t[n-1][sum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        boolean t[][] = new boolean[n + 1][sum + 1];

        boolean ans = subsetSumRecursiveMem(arr, n, sum, t);
        System.out.println(ans);

    }
}
