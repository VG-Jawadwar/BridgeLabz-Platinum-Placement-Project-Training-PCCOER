package day_6;

import java.util.Arrays;
import java.util.Scanner;

public class bl_day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student Roll Number Organizer
//		int[] arr = new int[5];
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 5 Student Marks:");
//		
//		for(int i =0;i<arr.length;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Sorted Using \"Bubble Sort\" in Ascending Order: ");
//		for(int i =0;i<arr.length-1;i++)
//		{
//			for(int j =i;j<arr.length;j++)
//			{
//				if(arr[i] > arr[j])
//				{
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}	
//		}
//		
//		System.out.println("Sorted Numbers : "+Arrays.toString(arr));
		
		
		// Sports Day Finish Times
//		int[] arr = new int[5];
//		int totswap = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 5 Finish Times:");
//		
//		for(int i =0;i<arr.length;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Sorted Using \"Selection Sort\" in Ascending Order: ");
//		for(int i =0;i<arr.length-1;i++)
//		{
//			int num = arr[i];
//			
//			for(int j =i+1;j<arr.length;j++)
//			{
//				if(num > arr[j])
//				{
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}	
//		}
//		
//		System.out.println("Sorted Numbers : "+Arrays.toString(arr));
		
		
		// Playing Card Hand Ararnger - NOT COMPLETED ERRORS
//		int[] arr = new int[5];
//		int totswap = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 5 Finish Times:");
//		
//		for(int i =0;i<arr.length;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Sorted Using \"Insertion Sort\" in Ascending Order: ");
//		int jidx = 0;
//		for(int i =1;i<arr.length-1;i++)
//		{
//			int key = arr[0];
//			
//			for(int j =i+1;j<arr.length;j++)
//			{
//				if(key < arr[j])
//				{
//					jidx = j;
//				}
//			}
//			
//			int temp = arr[i];
//			arr[i] = arr[jidx];
//			arr[jidx] = temp;
//			
//			key = arr[i];
//		}
//		
//		System.out.println("Sorted Numbers : "+Arrays.toString(arr));
		
		
		
		//student marks analyzer
//		
//		int[] arr = new int[5];
//		int totswap = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 5 Finish Times:");
//		
//		for(int i =0;i<arr.length;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		int sun=0;
//		int high = arr[0];
//		int low = arr[0];
//		
//		for(int i = 1;i < 5;i++)
//		{
//			if(arr[i] < low)
//			{
//				low = arr[i];
//			}
//			if(arr[i] > high)
//			{
//				high = arr[i];
//			}
//			sun+=arr[i];
//		}
//		
//		System.out.println("\n\nOutput: High: "+high+"\nLow: "+low+"\nAvg: "+(sun/5));
		
		//Search For a Student Roll Number:
		
//		int[] arr = new int[5];
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 5 Roll Numbers:");
//		
//		for(int i =0;i<arr.length;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Enter Roll Number To Find: ");
//		int key = sc.nextInt();
//		boolean find = false;
//		int findidx = 0;
//		
//		for(int i =0;i<arr.length;i++)	
//		{
//			if(arr[i] == key)
//			{
//				find = true;
//				findidx = i;
//			}
//		}
//		
//		if(find)
//		{
//			System.out.println("Match Found At Index: "+findidx);
//		}else {
//			System.out.println("Match Not Found!!!!!");
//		}
		
		//Warehouse Stock Analyzer
	
//		Scanner sc = new Scanner(System.in);
//		
//		int val = 0;
//		
//		System.out.println("--------------Welcome To Supermarket-------------------");
//		System.out.println("Enter Total Number of Products:");
//		int prodcount = sc.nextInt();
//		System.out.println("Enter Number of Quantity:");
//		int quantcount = sc.nextInt();
//		
//		int arr[][] = new int[prodcount][quantcount];
//		int max = 0;
//	
//		int sum = 0;
//	
//		for(int i =0;i<prodcount;i++)
//		{
//			for(int j =0;j<quantcount;j++)
//			{
//				System.out.println("Enter "+(j+1)+" Quantity Value for "+(i+1)+" Product");
//				arr[i][j] = sc.nextInt();
//			}	
//		}
//		
//		//row - product
//		// column - section
//		
//		for(int i =0;i<prodcount;i++)
//		{
//			for(int j =0;j<quantcount;j++)
//			{
//				sum+=arr[i][j];
//				val+=arr[i][j];
//				
//			}
//			if(val>max)
//			{
//				max = val;
//			}
//			
//			val = 0;
//		}
//		System.out.println("Total Sum: "+sum);
//		System.out.println("Max Quantity: "+max);
////		System.out.println("Max Quantity Product/Section: "+sec); - not IMPLEMENETED ADD CODE
//		
		
		
		//Hospital patient Monitoring Grid
		
		Scanner sc = new Scanner(System.in);
		
		int val = 0;
		
		System.out.println("--------------Welcome To Hospital-------------------");
		System.out.println("Enter Total Number of Days:");
		int prodcount = sc.nextInt();
		System.out.println("Enter Number of Departments:");
		int quantcount = sc.nextInt();
		
		int arr[][] = new int[prodcount][quantcount];
		int max = 0;
	
		int sum = 0;
	
		for(int i =0;i<prodcount;i++)
		{
			for(int j =0;j<quantcount;j++)
			{
				System.out.println("Enter Number of Patients for Day "+(i+1)+" For Dept: "+(j+1));
				arr[i][j] = sc.nextInt();
			}	
		}

		max = arr[0][0];
		System.out.println("---------------------Result-----------------");
		
		for(int i =0;i<prodcount;i++)
		{
			for(int j =1;j<quantcount;j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}	
			}
			System.out.println("Max Patients for Day "+(i+1)+" is: "+max);
			max = 0;
		}
		
//		System.out.println("Total Sum: "+sum);
//		System.out.println("Max Quantity: "+max);
////		System.out.println("Max Quantity Product/Section: "+sec); - not IMPLEMENETED ADD CODE
		
		
		
	}
}
