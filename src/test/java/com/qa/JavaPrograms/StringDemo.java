package com.qa.JavaPrograms;

import java.util.HashMap;

public class StringDemo {
	
	public static void main(String args[]) {
	
		String str="John Walker Automation Tester";
		
		String arr[]=str.split(" ");
		
		if(arr.length>=2) {
			String initials=arr[0].charAt(0)+" "+arr[1].charAt(0);
			
			StringBuilder res=new StringBuilder(initials);
			
			for(int i=2;i<arr.length;i++) {
				res.append(" ").append(arr[i]);
			}
			
			System.out.print(res.toString());
			
		}
		
		
		String str1="AhAbbhAsdA";
		
		int count=1;

		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='A'||str1.charAt(i)=='a') {
				for(int j=0;j<count;j++) {
					result.append('#');
				}
				count++;
			}else {
				result.append(str1.charAt(i));
			}
			
		}
		
		System.out.println(result.toString());
		
		
	}

}
