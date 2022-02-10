import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class patterns {
    private static void prerequisitePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("- ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    private static void pattern0(int n) {
        int nsp = n;
        int nst = n;
        for (int r = 0; r < nsp; r++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("- ");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("* ");
            }
            nsp += 0;
            nst += 0;
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }
            nst += 1;
            nsp -= 1;
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        // int nsp = n - 1;
        int nst = 1;
        for (int r = 0; r < n; r++) {
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }
            nst += 1;
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        int nsp = 0;
        int nst = n;
        for (int r = 0; r < n; r++) {
            for (int cst = nst; cst > 0; cst--) {
                System.out.print("*\t");
            }
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            nst -= 1;
            nsp += 1;
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        int nsp = 0;
        int nst = n;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = nst; cst > 0; cst--) {
                System.out.print("*\t");
            }
            nsp += 1;
            nst -= 1;
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }

            nsp -= 1;
            nst += 2;
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        int nst = (2 * n) - 1;
        int nsp = 0;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }

            nst -= 2;
            nsp += 1;
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        int nst = 1;
        int nsp = n / 2;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }

            if (r < n / 2) {
                nst += 2;
                nsp -= 1;
                System.out.println();
            } else {
                nst -= 2;
                nsp += 1;
                System.out.println();
            }
        }
    }

    private static void pattern8(int n) {
        int nst = (n + 1) / 2;
        int nsp = 1;
        for (int r = 0; r < n; r++) {
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }
            if (r < n / 2) {
                nsp += 2;
                nst -= 1;
            } else {
                nst += 1;
                nsp -= 2;
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == c) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r + c == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    private static void pattern11(int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == c || r + c == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }

    private static void pattern12(int n) {
        int nst = 0;
        int nsp1 = n / 2;
        int nsp2 = -1;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp1; csp++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int csp = 0; csp < nsp2; csp++) {
                System.out.print("\t");
            }
            if (r > 0 && r < n - 1) {
                System.out.print("*\t");
            }
            if (r < n / 2) {
                nsp1 -= 1;
                nsp2 += 2;
            } else {
                nsp1 += 1;
                nsp2 -= 2;
            }
            System.out.println();
        }
    }

    private static void pattern11_method2(int n) {
        int nsp1 = 0;
        int nsp2 = n - 2;
        for (int r = 0; r < n; r++) {
            for (int csp = 0; csp < nsp1; csp++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int csp = 0; csp < nsp2; csp++) {
                System.out.print("\t");
            }
            if (r != n / 2)
                System.out.print("*\t");

            if (r < n / 2) {
                nsp1 += 1;
                nsp2 -= 2;
            } else {
                nsp2 += 2;
                nsp1 -= 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // prerequisitePattern(n);
        // pattern0(n);
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern11(n);
        // pattern12(n);

        pattern11_method2(n);
        /*
         * pattern14(n);
         * pattern15(n);
         */
    }
}
