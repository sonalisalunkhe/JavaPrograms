package com.qa.JavaPrograms;

public class SumOfArray {
	
	public static void main(String args[]) {
	
		int[] num= {1, 2, 4, 6, 7};
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		
		System.out.println(sum);
		
	}

}
