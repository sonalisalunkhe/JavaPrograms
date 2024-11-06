package JavaPractice;

import java.util.Arrays;

public class SmallestAndLargestArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {4,5,6,7,3,4,9,10,1,2};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest){
				smallest=arr[i];
			}
			
		}
		System.out.println("smallest :::"+smallest);
		System.out.println("largest :::"+largest);
		
		
		
		//------------
		
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.println(i);

		}
		
		System.out.println("smallest :::"+arr[0]);
		System.out.println("largest :::"+arr[arr.length-1]);


	}

}
