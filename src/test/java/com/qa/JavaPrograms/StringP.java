package com.qa.JavaPrograms;

public class StringP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String str="test377 tgs^&* ^&* hhsbh &*";
		
		String newStr=str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(newStr);

	}

}
