package sample;

import java.sql.Array;
import java.util.Arrays;

public class ArraySort {

	static int temp,i,j;

	public static void main(String[] args) {
		int [] array = {190,15,10,65,91};
		int n = array.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Largest element in an array  is "+array[n-1]);
		System.out.println("Second largest element in an array  is "+array[n-2]);
		System.out.println("Smallest element in an array  is "+array[0]);
	}
}
//  > = descending order
//  < = ascending order
