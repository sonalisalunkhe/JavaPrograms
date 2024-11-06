package JavaPractice;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int number=23456;
	int rev=0;
	
	while(number>0) {
		int reminder=number%10;
		
		rev=rev*10+reminder;
		
		number=number/10;
	}
		
	
	System.out.println(rev);
	}

}
