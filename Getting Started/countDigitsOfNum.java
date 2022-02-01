import java.util.*;

import javax.swing.text.html.StyleSheet;

public class countDigitsOfNum {

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = (int) num / 10;
            count += 1;
        }
        return count;
    }

    public static void printDigits(int num) {
        int len = countDigits(num);
        int div = (int) Math.pow(10, len-1);
        //imp - consider trailing zeros
        //so we dont use num!=0
        while (div != 0) {
            int quotient = num / div;
            System.out.println(quotient);

            num = num % div;
            div/=10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
        printDigits(n);
    }
}
