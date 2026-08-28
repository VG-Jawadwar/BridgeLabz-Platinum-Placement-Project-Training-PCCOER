package day_3;

import java.util.Scanner;

//interface a{
//	public void ap();
//}
//
//interface b{
//	public void ap();
//}

public class bl_day3  {
	
	public static String name = "Surender";

	public int totalbill(int amt,int tip)
	{
		return amt+tip;
	}
	
	public int tipcal(int amt, int rating)
	{
		double tip = 0;
		
		switch(rating)
		{
		case 1:
			tip = tip+ (amt*0.5);
			break;
		case 2:
			tip = tip+ (amt*0.8);
			break;
		case 3:
			tip = tip+ (amt*1.0);
			break;
		case 4:
			tip = tip+ (amt*1.5);
			break;
		case 5:
			tip = tip+ (amt*2.0);
			break;
		}
		
		return (int)tip;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int total = 0;
//		Scanner sc = new Scanner(System.in);
//		int opt;
//		
//		do
//		{
//			System.out.println("------------Welcome To SuperMart----------");
//			System.out.println("1. Apple/100 Rs.");
//			System.out.println("2. Banana/25 Rs.");
//			System.out.println("3. Carrot/50 Rs.");
//			System.out.println("4. Exit");
//		
//			System.out.println("\nEnter Your Choice: ");
//			opt = sc.nextInt();
//
//			switch (opt) {
//			case 1:
//				total+=100;
//			break;
//			case 2:
//				total+=25;
//			break;
//			case 3:
//				total+=50;
//			break;
//			}
//			
//		}while(opt!=4);
//		
//		System.out.println("\n------------Thank You For Visiting----------");
//		System.out.println("Total Bill: "+total);
//		
//		sc.close();

		
//		Scanner sc = new Scanner(System.in);
//		int CURR_BAL = 10000;
//		
//		System.out.println("-----------------Welcome to ATM---------------");
//		int MAX_ATTEMPT = 3;
//		boolean accessg = false;
//		
//		
//		
//		while(MAX_ATTEMPT > 0)
//		{
//			System.out.println("Enter Your Card Number: ");
//			int card = sc.nextInt();
//			if(String.valueOf(card).length() == 8)
//			{
//				System.out.println("Enter Your Pin: ");
//				int pin = sc.nextInt();
//				
//				if(String.valueOf(Math.abs(pin)).length() == 4)
//				{
//					accessg = true;
//					break;
//				}else
//				{
//					MAX_ATTEMPT -=1;
//					System.out.println("Invalid Pin, "+MAX_ATTEMPT+" Lefts..");
//				}
//			}else
//			{
//				MAX_ATTEMPT -=1;
//				System.out.println("Invalid Card Num, "+MAX_ATTEMPT+" Lefts..");
//				
//			}
//		
//		}
//		
//		while(accessg == true)
//		{
//			System.out.println("1. Withdraw");
//			System.out.println("2. Deposit");
//			System.out.println("3. Check Balance");
//			System.out.println("4. Exit");
//		
//			int opt = sc.nextInt();
//			
//			switch (opt) {
//			
//			case  1:
//				System.out.println("Enter Amount: ");
//				int wid_amt = sc.nextInt();
//				CURR_BAL -=wid_amt;
//				break;
//			case  2:
//				System.out.println("Enter Amount: ");
//				int dep_amt = sc.nextInt();
//				CURR_BAL +=dep_amt;
//				break;
//			case  3:
//				System.out.println("Current Balance Is: "+CURR_BAL);
//				break;
//			case  4:
//				accessg = false;
//				break;
//			}
//		}
//		
//		System.out.println("\n------------Thank You For Visiting----------");
		
		
		//error code - search on google
		
//		bl_day3 bl = new bl_day3();
//		
//		b.super.ap();
//		
//		bl.ap();
		
		
		//Functions
		
//		bl_day3 bl = new bl_day3();
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("Enter Table Number: ");
//		int tbl = sc.nextInt();
//		System.out.println("Enter Bill Amount: ");
//		int bill = sc.nextInt();
//		System.out.println("Enter Tip Percentage: ");
//		int tippr = sc.nextInt();
//		
//		System.out.println("Thank you for Visiting Mr. "+name+" Table Number: "+tbl+ " Your Total Bill: "+bl.totalbill(bill, bl.tipcal(bill, tippr)));


		// Method Overloading
		
//		bl_day3 bl = new bl_day3();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the Data Type: ");
//		String type = sc.nextLine();
//		
//		switch (type) {
//
//		case "int":
//			System.out.println("Enter Num 1: ");
//			int n1_int = sc.nextInt();
//			System.out.println("Enter Num 2: ");
//			int n2_int = sc.nextInt();
//			bl.add(n1_int, n2_int);
//			break;
//		case "double":
//			System.out.println("Enter Num 1: ");
//			double n1_double = sc.nextDouble();
//			System.out.println("Enter Num 2: ");
//			double n2_double = sc.nextDouble();
//			bl.add(n1_double, n2_double);
//			break;
//		case "string":
//			System.out.println("Enter Num 1: ");
//			String n1_String = sc.nextLine();
//			System.out.println("Enter Num 2: ");
//			String n2_String = sc.nextLine();
//			bl.add(n1_String, n2_String);
//			break;
//		
//		}
		
		
		
		//Library Book Searching program
		
		String auther[] = new String[5];
		String Year[] = new String[5];
		String title[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Total Number of Books: ");
		int num = sc.nextInt();
		
		for(int i = 0;i<num;i++)
		{
			System.out.println("Enter Book Author: ");
			auther[i] = sc.nextLine();
			System.out.println("Enter Book Year: ");
			Year[i] = sc.nextLine();
			System.out.println("Enter Book Title: ");
			title[i] = sc.nextLine();
		}
		
		
		
	}
	
		
//		String

//	@Override
//	public void ap() {
//		// TODO Auto-generated method stub
//		System.out.println("Welcome to AP");
//	}

}
