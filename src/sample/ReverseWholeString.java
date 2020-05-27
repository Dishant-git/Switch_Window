package sample;

import java.util.Scanner;

public class ReverseWholeString {

	//	public static void main(String[] args) {
	//		String s1 = "this is java programme";
	//		
	//		for(int i=s1.length()-1;i>=0;i--){
	//			System.out.print(s1.charAt(i));
	//		}
	//	}
//		public static void main(String[] args) {
//		String s = "selenium!@#$";
//		s = s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);
//		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Entered string is "+s);
		char[] s1 = s.toCharArray();
		String s2 = s.toLowerCase();
		int count=0;
		for(int i='a';i>'z';i++){
			if(count==i){
				
			}
		}
	}
}