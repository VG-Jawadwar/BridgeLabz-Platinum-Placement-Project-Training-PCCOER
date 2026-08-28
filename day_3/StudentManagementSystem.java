package day_3;

import java.util.Scanner;

public class StudentManagementSystem {

    static int rollCounter = 1;
    static void enrollStudent(String name, String course) {

        String courseCode;

        if (course.equalsIgnoreCase("Java")) {
            courseCode = "JAVA";
        } else if (course.equalsIgnoreCase("Python")) {
            courseCode = "PYTHON";
        } else {
            courseCode = "DS";
        }

        System.out.println("Enrolled: " + name + " in " + course
                + " (Roll: " + courseCode + "_00" + rollCounter + ")");

        rollCounter++;
    }

    static double calculateFee(String course) {

        if (course.equalsIgnoreCase("Java")) {
            return 15000;
        } else if (course.equalsIgnoreCase("Python")) {
            return 12000;
        } else if (course.equalsIgnoreCase("DataScience")) {
            return 20000;
        }

        return 0;
    }

    static double calculateFee(String course, boolean hasScholarship) {

        double fee = calculateFee(course);

        if (hasScholarship) {
            fee = fee - (fee * 20 / 100);
        }

        return fee;
    }

    static double calculateFee(String course, boolean hasScholarship,
                               boolean isLate) {

        double fee = calculateFee(course, hasScholarship);

        if (isLate) {
            fee = fee + 500;
        }

        return fee;
    }

    static double calculateAverage(int[] marks) {

        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return (double) total / marks.length;
    }

    static String determineGrade(double average) {

        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    static void printReport(String name, String course, double fee,
                            double average, String grade, int[] marks) {

        System.out.println("\n=== Report: " + name + " ===");
        System.out.println("Course: " + course);
        System.out.println("Fee Paid: Rs." + fee);

        System.out.print("Marks: ");

        for (int i = 0; i < marks.length; i++) {

            System.out.print(marks[i]);

            if (i < marks.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.printf("%nAverage: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("=====================");
    }

    public static void main(String[] args) {

        String name1 = "Vaibhav";
        String course1 = "Java";

        enrollStudent(name1, course1);

        double fee1 = calculateFee(course1);

        int[] marks1 = {85, 90, 78};

        double average1 = calculateAverage(marks1);
        String grade1 = determineGrade(average1);

        System.out.println("Fee: Rs." + fee1);

        printReport(name1, course1, fee1, average1, grade1, marks1);
        
        String name2 = "Harsh";
        String course2 = "Python";

        enrollStudent(name2, course2);

        double fee2 = calculateFee(course2, true);

        int[] marks2 = {92, 88, 95};

        double average2 = calculateAverage(marks2);
        String grade2 = determineGrade(average2);

        System.out.println("Fee: Rs." + fee2 + " (Scholarship applied)");

        printReport(name2, course2, fee2, average2, grade2, marks2);

        String name3 = "Krushna";
        String course3 = "DataScience";

        enrollStudent(name3, course3);

        double fee3 = calculateFee(course3, false, true);

        int[] marks3 = {80, 75, 85};

        double average3 = calculateAverage(marks3);
        String grade3 = determineGrade(average3);

        System.out.println("Fee: Rs." + fee3 + " (Late fee applied)");

        printReport(name3, course3, fee3, average3, grade3, marks3);
    }
}