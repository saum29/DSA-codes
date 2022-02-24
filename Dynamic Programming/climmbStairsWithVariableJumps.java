import java.util.Scanner;

public class climmbStairsWithVariableJumps {

    public static int climbVarSteps(int[] arr, int src, int dest) {
        if (src == dest) {
            return 1;
        }

        int count = 0;
        for (int jump = 1; jump + src <= dest && jump <= arr[src]; jump++) {
            count += climbVarSteps(arr, src + jump, dest);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = climbVarSteps(arr, 0, n);
        System.out.println(ans);
    }
}
