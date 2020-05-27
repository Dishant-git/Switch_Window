package sample;

public class Fibonacci {

	int t1=0;
	int t2=1;
	int sum,i;
	char ch='i';
	
	public void fibonacci(){
		
		for(i=1;i<=10;i++){
			sum = t1+t2;
			t1=t2;
			t2=sum;
			System.out.print(sum);
		}
	}
	
	public void vowels(){
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println(ch+ " Is vowel");
		}
		else{
			System.out.println("Character is consonent");
		}
	}
	public static void main(String[] args) {
		Fibonacci b1 = new Fibonacci();
		b1.fibonacci();
//		b1.vowels();
	}
	
}
