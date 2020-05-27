package sample;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "amadama";
		int j = s1.length()-1;
		int size = s1.length()-1;
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s1.charAt(j)){
				--j;
			if(i==size){
				System.out.println("Palindrome");
			}}
			else{
				System.out.println("Not Palindrome");
				break;
			}			
		}		
	}
}