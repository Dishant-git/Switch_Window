package sample;

import java.util.Scanner;

public class Average {

	static int sum, sum1, sum2;
	
	public static int first(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subjects");
		int number1 = sc.nextInt();
		System.out.println("Enter marks in each subject");
		
		for(int i=1;i<=number1;i++){
			int number = sc.nextInt();
			sum=sum+number;
		}
		System.out.println("The sum of first student is "+sum);
		return sum;
	}
	
	public static int second(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subjects");
		int number1 = sc.nextInt();
		System.out.println("Enter marks in each subject");
		
		for(int i=1;i<=number1;i++){
			int number = sc.nextInt();
			sum1=sum1+number;
		}
		System.out.println("The sum of first student is "+sum1);
		return sum1;
	}
	
	public static void main(String[] args) {
		first(); 
		second();
		sum2 = sum+sum1;
		System.out.println("The sum of first & second student is "+sum2);
		float avg = (float)sum2/2;
		System.out.println("Average of both students marks is "+avg);
	}
}
