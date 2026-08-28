package bridgeLabz;

import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter Years of Service: ");
        int yearsOfService = sc.nextInt();

        double HRA = basicSalary * 25 / 100;
        double DA = basicSalary * 15 / 100;
        double TA = basicSalary * 10 / 100;
        double PF = basicSalary * 12 / 100;

       
        double grossSalary = basicSalary + HRA + DA + TA;

       
        double netSalary = grossSalary - PF;

       
        double annualSalary = netSalary * 12;

        
        double tax;

        if (annualSalary > 500000) {
            tax = annualSalary * 10 / 100;
        } else {
            tax = 0;
        }

      
        int netSalaryInt = (int) netSalary;

       
        double takeHome = annualSalary - tax;

      
        System.out.println("\n----------------------------------------------");
        System.out.println("		EMPLOYEE PAYROLL SLIP");
        System.out.println("----------------------------------------------");

        System.out.println("Employee Name    : " + employeeName);
        System.out.println("Employee ID      : " + employeeId);
        System.out.println("Years of Service : " + yearsOfService);

        System.out.println("----------------------------------------------");

        System.out.printf("Basic Salary     : Rs.%.2f%n", basicSalary);
        System.out.printf("HRA (25)         : Rs.%.2f%n", HRA);
        System.out.printf("DA (15)          : Rs.%.2f%n", DA);
        System.out.printf("TA (10)          : Rs.%.2f%n", TA);

        System.out.println("----------------------------------------------");

        System.out.printf("Gross Salary     : Rs.%.2f%n", grossSalary);
        System.out.printf("PF (12)          : Rs.%.2f%n", PF);

        System.out.println("----------------------------------------------");

        System.out.printf("Net Salary       : Rs.%.2f%n", netSalary);
        System.out.println("Net             : Rs." + netSalaryInt);

        System.out.println("----------------------------------------------");

   
        System.out.println("ANNUAL SALARY DETAILS");
        System.out.println("----------------------------------------------");

        System.out.printf("Annual Package   : Rs.%.2f%n", annualSalary);
        System.out.printf("Tax (10)         : Rs.%.2f%n", tax);
        System.out.printf("Take Home        : Rs.%.2f%n", takeHome);

        System.out.println("----------------------------------------------");

        sc.close();
    }
}
