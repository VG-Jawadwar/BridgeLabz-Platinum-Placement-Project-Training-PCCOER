package bridgeLabz;

import java.util.Scanner;

public class StudentGradingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int mark3 = sc.nextInt();

        if (mark1 < 0 || mark1 > 100 ||
            mark2 < 0 || mark2 > 100 ||
            mark3 < 0 || mark3 > 100) {

            System.out.println("Invalid marks entered");
            return;
        }

       
        double average = (mark1 + mark2 + mark3) / 3.0;

     
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

      
        boolean passed;

        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40
                && average >= 50) {
            passed = true;
        } else {
            passed = false;
        }

        
        if (!passed) {

            int graceCount = 0;

            
            if (mark1 >= 35 && mark1 <= 39) {
                graceCount++;
            }

            if (mark2 >= 35 && mark2 <= 39) {
                graceCount++;
            }

            if (mark3 >= 35 && mark3 <= 39) {
                graceCount++;
            }

           
            if (graceCount == 1) {

                if (mark1 >= 35 && mark1 <= 39) {
                    mark1 = mark1 + 5;
                    System.out.println("Grace marks applied to Subject 1");
                    System.out.println("Re-evaluated Subject 1: " + mark1);

                } else if (mark2 >= 35 && mark2 <= 39) {
                    mark2 = mark2 + 5;
                    System.out.println("Grace marks applied to Subject 2");
                    System.out.println("Re-evaluated Subject 2: " + mark2);

                } else if (mark3 >= 35 && mark3 <= 39) {
                    mark3 = mark3 + 5;
                    System.out.println("Grace marks applied to Subject 3");
                    System.out.println("Re-evaluated Subject 3: " + mark3);
                }

              
                average = (mark1 + mark2 + mark3) / 3.0;

                
                if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40
                        && average >= 50) {
                    passed = true;
                }
            }
        }

      
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

       
        String remark;

        switch (grade) {
            case 'A':
                remark = "Excellent";
                break;

            case 'B':
                remark = "Good";
                break;

            case 'C':
                remark = "Average";
                break;

            case 'D':
                remark = "Below Average";
                break;

            default:
                remark = "Fail";
        }

       
        System.out.println("==================");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remark: " + remark);

        if (passed) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        System.out.println("==================");

        sc.close();
    }
}