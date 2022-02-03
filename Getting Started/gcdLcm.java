import java.util.Scanner;

public class gcdLcm {
    private static int Lcm(int n1, int n2) {
        int gcd = Gcd(n1, n2);
        int lcm = (n1 * n2) / gcd;
        return lcm;
    }

    private static int Gcd(int n1, int n2) {
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = Gcd(n1, n2);
        int ans2 = Lcm(n1, n2);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
