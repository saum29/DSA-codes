import java.util.*;

public class reverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
         * while (n != 0) {
         * int rem = n % 10;
         * n /= 10;
         * 
         * System.out.println(rem);
         * }
         */
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;

        }
        System.out.println(rev);
    }
}