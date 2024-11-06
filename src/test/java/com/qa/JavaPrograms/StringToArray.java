package com.qa.JavaPrograms;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		
		char[] arr=str.toCharArray();
		
		
		for(int i=0;i<str.length();i++) {
			System.out.println(arr[i]);
		}

	}

}
