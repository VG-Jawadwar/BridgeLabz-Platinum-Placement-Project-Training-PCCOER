package day_4;

import java.util.Scanner;

import javax.print.attribute.DocAttributeSet;
import javax.xml.crypto.dsig.dom.DOMValidateContext;

public class bl_day4 {
	
	public static final int MAX_HEIGHT = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Building Evacuation System - confirm once name
		
//		bl_day4 bl = new bl_day4();
//		Scanner sc = new Scanner(System.in);
//		int height = sc.nextInt();	
//		bl.printTriangle(height);
		
		
		// Student Academic Performance System - incomplete and has errors solve that
//		Scanner sc = new Scanner(System.in);
//		
//		int Math,Science,English,CS,History;
//		final int MAX_MARKS = 100;
//		final int TOTAL_SUBJECT = 5;
//		
//		System.out.println("Enter Marks for Math: ");
//		Math = sc.nextInt();
//		System.out.println("Enter Marks for Science: ");
//		Science = sc.nextInt();
//		System.out.println("Enter Marks for English: ");
//		English = sc.nextInt();
//		System.out.println("Enter Marks for Computer Science: ");
//		CS = sc.nextInt();
//		System.out.println("Enter Marks for History: ");
//		History = sc.nextInt();
//		
//		validate(Math);
//		validate(Science);
//		validate(English);
//		validate(CS);
//		validate(History);
//		
//		grade(Math);
//		grade(Science);
//		grade(English);
//		grade(CS);
//		grade(History);
//		
//		int total = Math+Science+English+CS+History;
//		double per = total/5;
//		System.out.println("Percentage: "+String.format("%.2f", per));
		
		
//		Manufacturing Batch Calculator
		
		/*
		 Q. 
		 
		 red can't be greater than green
		 yellow can't be more than 40% of total balls
		 
		 if(red+1 < green && yellow+1 < (total+1 * 0.4))
		 {
		 
		 }
	
		 */
		
//		bl_day4 bl = new bl_day4();
//		System.out.println("Using Recursive Method: "+bl.factorialRecursion(5));
//		System.out.println("Using Iterative Method: "+bl.factorialIterative(5));
		
		
		// Calculator System using method overloading
		Scanner sc = new Scanner(System.in);
		bl_day4 cl = new bl_day4();
		int ch;
		
		do {
			
			System.out.println("1. two Operands");
			System.out.println("2. Three Operands");
			System.out.println("3. Exit");
			ch = sc.nextInt();
			
			if (ch == 1)
			{
				System.out.println("Enter Num 1: ");
				int n1 = sc.nextInt();
				System.out.println("Enter Num 2: ");
				int n2 = sc.nextInt();
				System.out.println("Enter Operator (+,-,*,/,%): ");
				String op = sc.next();
				cl.calculate(n1, n2, op);
			}else if (ch == 2)
			{
				System.out.println("Enter Num 1: ");
				int n1 = sc.nextInt();
				System.out.println("Enter Num 2: ");
				int n2 = sc.nextInt();
				System.out.println("Enter Num 3: ");
				int n3 = sc.nextInt();
				System.out.println("Enter Operator (+,-): ");
				String op = sc.next();
				cl.calculate(n1, n2,n3, op);
			}
		}while(ch != 3);
		
	}
	
	public int calculate(int num1, int num2, String op)
	{
		switch (op)
		{
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "*":
			return num1*num2;
		case "/":
			
			if(num1 == 0 || num2 == 0)
			{
				System.out.println("Number Cant be Zero");
				System.exit(0);
			}else
			{
				return num1/num2;
			}
			
		case "%":
			return num1%num2;
		}
	
		return 0;
		
	}
	
	public double calculate(double num1, double num2, String op)
	{
		switch (op)
		{
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "*":
			return num1*num2;
		case "/":
			
			if(num1 == 0 || num2 == 0)
			{
				System.out.println("Number Cant be Zero");
				System.exit(0);
			}else
			{
				return num1/num2;
			}
			
		case "%":
			return num1%num2;
		}
	
		return 0;
		
	}
	
	
	public int calculate(int num1, int num2,int num3, String op)
	{
		switch (op)
		{
		case "+":
			return num1+num2 * num3;
		case "-":
			return (num1+num2) - num3;
		}
	
		return 0;
		
	}
	
	public void validate(int num1, int num2, String op)
	{
		if(num1 == 0 || num2 == 0)
		{
			System.out.println("Number Cant be Zero");
			System.exit(0);
		}
		
		if(op != "+"||op != "-"||op != "*"||op != "/"||op != "%")
		{
			System.out.println("Invalid Operator");
			System.exit(0);
		}
	}
	
	
	public void validate(int num1, int num2, int num3, String op)
	{
		if(num1 == 0 || num2 == 0 || num3 == 0)
		{
			System.out.println("Number Cant be Zero");
			System.exit(0);
		}
		
		if(op != "+"||op != "-")
		{
			System.out.println("Invalid Operator");
			System.exit(0);
		}
	}
	
	
	
//	public int factorialIterative(int num)
//	{
//		int fact = 1;
//		
//		while(num>=1)
//		{
//			fact = fact*num;
//			num--;
//			
//		}
//		
//		for(int i = 1;i<=num;i++)
//		{
//			fact = fact*i;
//		}
//		
//		return fact;
//	
//	}
//	
	
//	public int factorialRecursion(int num)
//	{
//		if(num==0||num==1)
//		{
//			return 1;
//		}else
//		{
//			return num*factorialRecursion(num-1);
//		}
//	}
//	
	
//	public static void grade(int num)
//	{
//		int casenum = 0;
//		
//		if(num>90 || num<=100)
//		{
//			casenum = 1;
//		}else if(num>80 || num<=89)
//		{
//			casenum = 2;
//		}else if(num>70 || num<=79)
//		{
//			casenum = 3;
//		}else if(num>60 || num<=69)
//		{
//			casenum = 4;
//		}else if(num<60)
//		{
//			casenum = 5;
//		}
//		
//		System.out.println(casenum);
//		
//		
//		switch (casenum) {
//		case 1:
//			System.out.println("A");
//			break;
//		case 2:
//			System.out.println("B");
//			break;
//		case 3:
//			System.out.println("C");
//			break;
//		case 4:
//			System.out.println("D");
//			break;
//		case 5:
//			System.out.println("F");
//			break;
//			
//		}
//	}
//	
//	
//	public static void validate(int num)
//	{
//		if (num < 0 || num > 100)
//		{
//			System.out.println("Number Must be Between 0 to 100");
//			System.exit(0);
//		}
//	}
	
//	public void printTriangle(int height)
//	{
//		if(height<1 || height > MAX_HEIGHT)
//		{
//			System.out.println("Invalid Height, Program Stopped.");
//			return;
//		}
//		
//		for(int i = 1;i<=height;i++)
//		{
//			printLine(i);
//		}
//	}
//	
//	public void printLine(int peopleCount)
//	{
//		for(int i = 0;i<peopleCount;i++)
//		{
//			System.out.print("*");
//		}
//		
//		System.out.println();
//	}

}
