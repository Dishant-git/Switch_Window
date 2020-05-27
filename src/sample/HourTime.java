package sample;

public class HourTime {

	static int ans;

	public static void main(String[] args) {

		int[] arr = {23,00,21,30};
		int s1 = arr.length;

		int timestart = arr[0]*60+arr[1];
		int timestop = arr[2]*60+arr[3];
		if(arr[0]<arr[2]){
			ans = timestop - timestart;
		}else{
			ans = timestart - timestop;
		}
		if (ans>60){
			int hours = ans / 60; 
			int minutes = ans % 60;
			System.out.println(hours+":"+minutes);
		}
		else{
			System.out.println("0:"+ans);
		}
	}
}

