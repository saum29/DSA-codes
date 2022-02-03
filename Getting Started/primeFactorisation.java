import java.util.Scanner;

public class primeFactorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n);
        // System.out.println(ans);
    }

    private static void primeFactors(int n) {
        for (int pn = 2; pn * pn <= n; pn++) {
            while (n % pn == 0) {
                n/=pn;
                System.out.print(pn + " ");
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }
}
