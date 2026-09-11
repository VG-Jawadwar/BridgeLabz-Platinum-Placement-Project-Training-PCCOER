package day_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

       
        double[] salaries = new double[n];

    
        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary of Employee " + (i + 1) + ": ");
            salaries[i] = sc.nextDouble();
        }

     
        double total = 0;

        for (int i = 0; i < n; i++) {
            total = total + salaries[i];
        }

       
        double average = total / n;

     
        double highest = salaries[0];
        double lowest = salaries[0];

        int highestEmployee = 1;
        int lowestEmployee = 1;

        for (int i = 1; i < n; i++) {

            if (salaries[i] > highest) {
                highest = salaries[i];
                highestEmployee = i + 1;
            }

            if (salaries[i] < lowest) {
                lowest = salaries[i];
                lowestEmployee = i + 1;
            }
        }

       
        int aboveAverage = 0;

        for (int i = 0; i < n; i++) {
            if (salaries[i] > average) {
                aboveAverage++;
            }
        }

      
        int within5000 = 0;

        for (int i = 0; i < n; i++) {
            if (salaries[i] >= average - 5000 &&
                salaries[i] <= average + 5000) {
                within5000++;
            }
        }

      
        System.out.println();
        System.out.println("===== Salary Analysis Report =====");
        System.out.println("Employees: " + n);
        System.out.println("Total Payroll: Rs." + total);
        System.out.printf("Average Salary: Rs.%.2f%n", average);
        System.out.println("Highest Salary: Rs." + highest +
                           " (Employee " + highestEmployee + ")");
        System.out.println("Lowest Salary: Rs." + lowest +
                           " (Employee " + lowestEmployee + ")");
        System.out.println("Above Average: " + aboveAverage + " employees");
        System.out.println("Within Rs.5000 of Average: " +
                           within5000 + " employees");
        System.out.println("==================================");

        sc.close();
    }
}