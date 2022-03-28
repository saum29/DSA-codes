import java.util.*;

public class smallestConsecutiveSequence {

    public static int smallestCS(int[] arr, int n) {
        Arrays.sort(arr);
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                v.add(arr[i]);
            }
        }
        int count = 1;
        int ans = 1;

        for (int i = 0; i < v.size(); i++) {
            if (i > 0 && v.get(i) == v.get(i - 1) + 1) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.min(ans, count);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = smallestCS(arr, n);
        System.out.println(ans);
    }
}
