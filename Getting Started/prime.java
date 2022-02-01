import java.util.*;

public class prime {

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (isPrime(n) == true) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}