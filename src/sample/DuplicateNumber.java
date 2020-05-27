package sample;

import java.util.Arrays;

public class DuplicateNumber {

		public static void main(String[] args) {
	
			int arr[] = {10,20,30,10,40,20,55,60,10,40};
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						System.out.println("Duplicate number is " +arr[j]);
					}
				}
			}

	//		float arr1[] = new float[] {55.5f,20.3f,55.5f};
	//		for(int i=0;i<arr1.length-1;i++){
	//			for(int j=i+1;j<=arr1.length-1;j++){
	//				if(arr1[i]==arr1[j]){
	//					System.out.println("Duplicate number is "+arr1[j]);
	//				}
	//			}
	//		}

//	public static int removeDuplicateElements(int arr[], int n){  
//		if (n==0 || n==1){  
//			return n;  
//		}  
//		int[] temp = new int[n];  
//		int j = 0;  
//		for (int i=0; i<n-1; i++){  
//			if (arr[i] != arr[i+1]){  
//				temp[j++] = arr[i];  
//			}  
//		}  
//		temp[j++] = arr[n-1];     
//		// Changing original array  
//		for (int i=0; i<j; i++){  
//			arr[i] = temp[i];  
//		}  
//		return j;  
//	}  
//
//	public static void main (String[] args) {
//		int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array  
//		Arrays.sort(arr);//sorting array  
//		int length = arr.length;  
//		length = removeDuplicateElements(arr, length);  
//		//printing array elements  
//		for (int i=0; i<length; i++)  
//			System.out.print(arr[i]+" ");  
	} 
}


