package sample;

import java.util.Scanner;

public class Lift {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your location");
		int user = sc.nextInt();
		System.out.println("Entered location is "+user);

		int lift1 = sc.nextInt();
		System.out.println("Entered location of lift1 "+lift1);

		int lift2 = sc.nextInt();
		System.out.println("Entered location of lift2 "+lift2);

		if(user>lift1&&user<lift2){
			int a = lift1%user;
			int b = lift2%user;
			if(a<b){
				System.out.println("Lift1 is coming");
			}else{
				System.out.println("Lift2 is coming");
			}
		}
		if(user<lift1&&user>lift2){
			int a = lift1%user;
			int b = lift2%user;
			if(a<b){
				System.out.println("Lift1 is coming");
			}else{
				System.out.println("Lift2 is coming");
			}
		}
		if(user>lift1&&user>lift2){
			int a = user%lift1;
			int b = user%lift2;
			if(a<b){
				System.out.println("Lift2 is coming");
			}else{
				System.out.println("Lift1 is coming");
			}
		}
		if(user<lift1&&user<lift2){
			int a = lift1%user;
			int b = lift2%user;
			if(a<b){
				System.out.println("Lift1 is coming");
			}else{
				System.out.println("Lift2 is coming");
			}
		}
	}
}

