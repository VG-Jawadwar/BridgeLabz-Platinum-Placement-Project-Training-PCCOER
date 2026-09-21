package day_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] addition = new int[n][n];
        int[][] subtraction = new int[n][n];
        int[][] transpose = new int[n][n];
        int[][] multiplication = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                addition[i][j] = A[i][j] + B[i][j];
                subtraction[i][j] = A[i][j] - B[i][j];
                transpose[j][i] = A[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    multiplication[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        boolean symmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != A[j][i]) {
                    symmetric = false;
                    break;
                }
            }

            if (!symmetric) {
                break;
            }
        }

        System.out.println("Matrix Operations: ");

        System.out.println("Matrix A + B:");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(addition[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        System.out.println("Matrix A - B:");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(subtraction[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        System.out.println("Transpose of A:");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        System.out.println("Matrix A x B:");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(multiplication[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        System.out.println("Is the Matrix A Symmetric? " +
                (symmetric ? "Yes" : "No"));
        sc.close();
    }
}