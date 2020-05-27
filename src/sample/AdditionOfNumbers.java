package sample;

import java.util.Scanner;

public class AdditionOfNumbers {
	
	static int a=1;
	static int sum,tab,sum1;
	static int i=1;
	static int y,v;
	static int b=1,fact=1;
	
	public static void addNumbers(){
		while(i<=100){
			for(i=1;i<=100;i++){
				sum=sum+i;
			}
			System.out.println(sum);
		}
	}
	
	public static void printTable(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		System.out.println("entered number is" +x);
		for(y=x;y<=x;y++){
			for(b=1;b<=10;b++){
			tab = x*b;
			System.out.println(tab);
			}
		}
	}
	
	public static void printSquare(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		System.out.println("entered number is" +x);
			for(b=x;b<=x;b++){
			tab = x*x;
			System.out.println(tab);
		}
	}

	public static void printSum(){
		for(v=1;v<=20;v++){
			if(v%2==0){
				sum=sum+v;
			}else if(v%2!=0){
				sum1 = sum1+v;
			}
		}
		System.out.println("Sum of even numbers" +sum);
		System.out.println("Sum of odd numbers" +sum1);
	}
	
	public static void factorial(){		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int g = input.nextInt();
		System.out.println("Entered number is"+g);
		for(i=1;i<=g;i++){
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	public static void fibonacci(int a, int b,int count){
	//	System.out.println(a);
	//	System.out.println(b);
		//for(i=1;i<=10;i++){
		if(count<=8){
			sum = a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			count++;
			fibonacci(a, b, count);
		}
	//	}
	}
	
//	public static void main(String[] args) {
//		AdditionOfNumbers a1 = new AdditionOfNumbers();
////		a1.addNumbers();
////		a1.printTable();
////		a1.printSquare();
////		a1.printSum();
////		a1.factorial();
//		a1.fibonacci(1,1, 1);
//	}
	
}
