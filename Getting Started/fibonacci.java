import java.util.*;

public class fibonacci {

    public static void firstNfibo(int num) {
        // 0 1 1 2 3 
        int a = 0, b = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        firstNfibo(n);
    }

}
