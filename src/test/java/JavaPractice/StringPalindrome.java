package JavaPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="BGHNshhdd";
		
		str=str.toLowerCase();
		
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			
			rev=str.charAt(i)+rev;
		}
		
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("palindrome");

		}else
		{
			System.out.println("not palindrome");

		}
	}

}
