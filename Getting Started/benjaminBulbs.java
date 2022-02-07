import java.util.Scanner;

public class benjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        curiousBenjaminBulbs(n);
    }

    private static void curiousBenjaminBulbs(int n) {
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}