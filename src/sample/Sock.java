package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sock {

	public static void main(String[] args) {
		int count=0;
		List<String> colours = new ArrayList<>();
		colours.add("Blue");
		colours.add("Red");
		colours.add("Blue");
		colours.add("Red");
		colours.add("Orange");
		colours.add("Blue");
//		colours.add("Blue");

		String[] arr = colours.toArray(new String[colours.size()]);  
//		List<String> color=new ArrayList<String>();
		/*for(int i=0;i<arr.length;i++) {
			if(!color.contains(arr[i])) {
				color.add(arr[i]);
			}
		}
		for(int i=0;i<color.size();i++) {
			int cnt=0;
			for(int j=0;j<arr.length;j++) {
				if(color.get(i)==arr[j]) {
					cnt++;
				}
			}
			if(cnt>=2) {
				count+=cnt/2;
				System.out.println(color.get(i)+" has pair :"+cnt/2);
			}
		}
		System.out.println("Total Pair : "+count);*/
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(colours.get(i).equals(colours.get(j))) {
					count++;
				}
			}
		}
		System.out.println(count/2);
	}
}