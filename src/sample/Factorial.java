package sample;

import java.util.Scanner;

public class Factorial extends AdditionOfNumbers {

	static int i;
	static int fact=1;
	static int x=13, y=12,z=8;
	
	public static void factorial(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integar");
		int a = input.nextInt();
		System.out.println("Enter integar "  +a);
		for(i=1;i<=a;i++)
		{
		fact = fact*i;
		}		
		System.out.println("factorial is "+fact);
	}
	
	public static void greatestNumber(){
		if(x>y&&x>z){
			System.out.println("x is greatest number");
		}
		else if(y>x&&y>z){
			System.out.println("y is greatest number");
		}
		else{
			System.out.println("z is greatest number");
		}
	}
	
	public static void main(String[] args) {
		Factorial c1 = new Factorial();
		Factorial.factorial();
//		Factorial.greatestNumber();
//		Factorial.addNumbers();
//		Factorial.printTable();
//		Factorial.printSquare();
	}
}
