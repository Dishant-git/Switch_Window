package sample;

public class Printnumbers {

	static int rows = 5;
	static int k = 1;
	static int j,i;

	public static void printnumbers(){
		for(int i=1;i<=rows;++i){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void reverseprintnumbers(){
		for(int i=1;i<=rows;++i){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=5;i>=1;--i){
			for(int j=1;j<=i;++j){
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void printadditionalnumbers(){
		for(int i=1;i<=rows;++i){
			for(int j=1;j<=i;j++){
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

	public static void pyramid(){
		for(int i=rows;i>=1;--i){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pyaramid2(){
		for(int i=1;i<=rows;++i){
			for(int j=1;j<=i;j++){
				System.out.print(k);
			}
			k++;
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Printnumbers a = new Printnumbers();
		//		a.printnumbers();
		//		a.printadditionalnumbers();
				a.pyramid();
		//		a.pyaramid2();
//		a.reverseprintnumbers();

	}
}
