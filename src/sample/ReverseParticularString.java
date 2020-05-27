package sample;

public class ReverseParticularString {

	static String rev = " ";
	static String temp = null;
	public static void main(String[] args) {
		String s1 = "My name is dishant";
		String d[] = s1.split(" ");
		
		if(d[0].equals("dishant")){
			for(int i=d[0].length()-1;i>=0;i--){
				rev = rev+d[0].charAt(i);
			}
			temp = rev+" "+d[1]+" "+d[2]+" "+d[3];
		}
		
		if(d[1].equals("dishant")){
			for(int i=d[1].length()-1;i>=0;i--){
				rev = rev+d[1].charAt(i);
			}
			temp = d[0]+" "+rev+" "+d[2]+" "+d[3];
		}
		
		if(d[2].equals(d[3])){
			for(int i=d[2].length()-1;i>=0;i--){
				rev = rev+d[2].charAt(i);
			}
			temp = d[0]+" "+d[1]+" "+rev+" "+d[3];
		}
		
		if(d[3]==d[3]){
			for(int i=d[3].length()-1;i>=0;i--){
				rev = rev+d[3].charAt(i);
			}
			temp = d[0]+" "+d[1]+" "+d[2]+" "+rev;
		}
		System.out.println(temp);
	}
}
