import java.util.Scanner;

public class decimalToBase {

    private static int anyBaseToDecimal(int n, int b) {
        

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = anyBaseToDecimal(n, b);
        System.out.println(ans);
    }
}
