package bridgeLabz;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = 1;

        while (choice != 0) {

            System.out.println("\n----- ACCOUNT MENU -----");
            System.out.println("1. Saving Account");
            System.out.println("2. Loan Account");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

               
                System.out.println("\n--- Saving Account ---");

                System.out.print("Enter Principal Amount: ");
                double P = sc.nextDouble();

                System.out.print("Enter Rate of Interest: ");
                double R = sc.nextDouble();

                System.out.print("Enter Time (in years): ");
                int T = sc.nextInt();

              
                double simpleInterest = (P * R * T) / 100;

                double totalAmount = P + simpleInterest;

                System.out.printf("Simple Interest: %.2f%n", simpleInterest);
                System.out.printf("Total Amount: %.2f%n", totalAmount);

            } else if (choice == 2) {

               
                System.out.println("\n--- Loan Account ---");

                System.out.print("Enter Principal Amount: ");
                double P = sc.nextDouble();

                System.out.print("Enter Rate of Interest: ");
                double R = sc.nextDouble();

                System.out.print("Enter Time (in years): ");
                int T = sc.nextInt();

                double totalAmount = P * Math.pow((1 + R / 100), T);

                double compoundInterest = totalAmount - P;

                System.out.printf("Compound Interest: %.2f%n", compoundInterest);
                System.out.printf("Total Amount: %.2f%n", totalAmount);

            } else if (choice == 0) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}