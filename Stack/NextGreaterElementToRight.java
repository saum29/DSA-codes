import java.util.Stack;

public class NextGreaterElementToRight {

    public static int[] solveNaive(int[] arr) {
        // 1. Naive approach
        int n = arr.length;
        int[] ans = new int[arr.length];
        ans[n - 1] = -1;
        for (int a = 0; a < n - 1; a++) {
            for (int j = a + 1; j < n; j++) {
                if (arr[j] > arr[a]) {
                    ans[a] = arr[j];
                    break;
                } else {
                    ans[a] = -1;
                }
            }
        }
        return ans;
    }

    public static int[] solve(int[] arr) {
        // 2. Better approach -- Stacks
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        st.push(arr[n - 1]);
        ans[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            // -,ans,+
            while (arr[i] >= st.peek() && st.size() > 0) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }
}
