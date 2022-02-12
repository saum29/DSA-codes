import java.util.*;

public class patterns_numbers {
    private static void pattern1(int n) {
        int nst = 1;
        for (int r = 0; r < n; r++) {
            for (int cst = 0; cst < nst; cst++) {
                System.out.print(nst + "\t");
            }
            nst++;
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        int nst = 1;
        int c = 1;
        for (int r = 0; r < n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(c + "\t");
                c++;
            }
            nst++;
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        int nst = 1;
        int nsp = n / 2;
        for (int r = 0; r < n; r++) {
            int c = r < n / 2 ? r + 1 : n - r;
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print(c + "\t");
            }
            if (r < n / 2) {
                nsp -= 1;
                nst += 2;
            } else {
                nsp += 1;
                nst -= 2;
            }
            System.out.println();
        }

    }

    private static void pattern4(int n) {
        int nsp = n / 2;
        int nst = 1;
        for (int r = 0; r < n; r++) {
            int c = r < n / 2 ? r + 1 : n - r;
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                // int cval = c;
                System.out.print(c + "\t");
                if (cst < nst / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (r < n / 2) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        int nst = 1;
        int nsp = n / 2;

        for (int r = 0; r < n; r++) {
            int c = r < n / 2 ? r + 1 : n - r;
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                // int c1 = c;
                System.out.print(c + "\t");
                if (cst < nst / 2) {
                    c--;
                } else {
                    c++;
                }
            }
            if (r < n / 2) {
                nsp -= 1;
                nst += 2;

            } else {
                nsp += 1;
                nst -= 2;

            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        int nst = 1;
        int nsp = (2 * n) - 3;
        for (int r = 0; r < n; r++) {
            for (int cst = 0; cst < nst; cst++) {
                System.out.print(cst + 1 + "\t");
            }
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }

            if (r == n - 1) {
                nst -= 1;
            }
            for (int cst = nst; cst > 0; cst--) {
                System.out.print(cst + "\t");
            }
            nsp -= 2;
            nst += 1;
            System.out.println();
        }
    }

    private static void pattern7(int n) { // pascals right triangle
        for (int r = 1; r <= n; r++) {
            // Variable used to represent C(r, i)
            int C = 1;
            for (int cst = 1; cst <= r; cst++) {
                // The first value in a line is always 1
                System.out.print(C + " ");

                C = C * (r - cst) / cst;
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) { // + types
        int nst = 1;
        int nsp = n / 2;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp && r != n / 2; csp++) {
                System.out.print("\t");
            }

            for (int cst = 0; cst < nst && r != n / 2; cst++) {
                System.out.print("*\t");
            }
            if (r == n / 2) {
                for (int i = 0; i < n; i++) {
                    System.out.print("*\t");
                }
            }

            if (r < n / 2) {
                nst += 1;
            } else {
                nst -= 1;
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {// hour glass
        int nst = n;
        int nsp1 = 0;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp1; csp++) {
                System.out.print("\t");
            }

            for (int cst = 0; cst < nst; cst++) {
                if (r > 0 && r < n / 2 && cst > 0 && cst < nst - 1)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }

            if (r < n / 2) {
                nsp1 += 1;
                nst -= 2;
            } else {
                nsp1 -= 1;
                nst += 2;
            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {// inverted hour glass
        int nst = n;
        int nsp1 = 0;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp1; csp++) {
                System.out.print("\t");
            }

            for (int cst = 0; cst < nst; cst++) {
                if (r > n / 2 && r < n - 1 && cst > 0 && cst < nst - 1)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }

            if (r < n / 2) {
                nsp1 += 1;
                nst -= 2;
            } else {
                nsp1 -= 1;
                nst += 2;
            }
            System.out.println();
        }
    }

    private static void pattern11(int n) { // M
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (c == 0 || c == n - 1)
                    System.out.print("*\t");

                else if (r <= n / 2 && (r == c || r + c == n - 1))
                    System.out.print("*\t");

                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) { // W
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (c == 0 || c == n - 1)
                    System.out.print("*\t");

                else if (r >= n / 2 && (r == c || r + c == n - 1))
                    System.out.print("*\t");

                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            pattern12(n);
        }
    }
}
