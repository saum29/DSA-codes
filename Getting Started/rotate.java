import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = rotateNum(n, k);
        System.out.println(ans);
    }

    private static int rotateNum(int n, int k) {
        int len = countDigitsOfNum(n);

        k = (k % len + len) % len;

        int div = 1, mul = 1;
        for (int i = 1; i <= len; i++)
            if (i <= k)
                div *= 10;
            else
                mul *= 10;

        int q = n / div;
        int r = n % div;

        return (r * mul + q);
    }

    private static int countDigitsOfNum(int n) {
        int c = 0;
        while (n != 0) {
            n = n / 10;
            c += 1;
        }
        return c;
    }
}
