package JavaPractice;

public class ReverseEachWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Welcome to java programming";
		
		String[] arr=str.split(" ");
		
		String result="";
		
		
		for(int i=0;i<arr.length;i++) {
			
			String word=arr[i];
			
			String rev="";
			for(int j=0;j<word.length();j++) {
				rev=word.charAt(j)+rev;
			}
			
			result=result+rev+" ";
			
		}
		
		System.out.println(result);
		
		

	}

}
