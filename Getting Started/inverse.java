import java.util.*;

public class inverse {

    private static int inverseOfNum(int n) {
        int c = 0;
        int inv = 0;
        while (n != 0) {
            c += 1;
            int rem = n % 10;
            inv += c * (int) Math.pow(10, rem - 1);
            n/=10;
        }
        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = inverseOfNum(n);
        System.out.println(ans);
    }

}
