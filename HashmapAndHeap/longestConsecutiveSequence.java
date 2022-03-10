import java.io.*;
import java.util.*;

public class longestConsecutiveSequence {

    public static int longestCSnaive(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 1;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void longestCS(int[] arr, int n) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        // 1. Set true for each element
        for (int ele : arr) {
            hm.put(ele, true);
        }

        // 2. Potential Starting point
        for (int ele : arr) {
            if (hm.containsKey(ele - 1)) {
                hm.put(ele, false);
            }
        }

        // 3. Traverse and find longest
        int maxC = 0;
        int maxStpt = 0;

        for (int ele : arr) {
            if (hm.get(ele) == true) {
                int startPt = ele;
                int count = 1;

                while (hm.containsKey(ele + count)) {
                    count++;
                }

                if (count > maxC) {
                    maxC = count;
                    maxStpt = startPt;
                }
            }
        }

        for (int i = maxStpt; i < maxStpt + maxC; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        longestCS(arr, n);
    }

}
