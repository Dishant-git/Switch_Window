package sample;

public class A {

//	private static final char[] k = null;
	public static void main(String[] args) {
//		 int rows = 5;
//		 int count = 5;
//	        for(int i = rows; i >= 1; i++) {
//	            for(int j = 1; j <= i; ++j) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
	
	
//	for(int i=1;i<=4;i++){
//		for(int j=1;j<=i;j++){
//			System.out.print(j);
//		}
//		System.out.println();
//	}
//  
	
	for(int i=1;i<=5;i++){
		for(int j=5;j>i;j--){
			System.out.print(" ");
		}
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
    	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print(" ");
		}
		 for(int k=i;k<=4;k++){
			 System.out.print(k+" ");
		 }
		 System.out.println(" ");
	}
	 }
  }
