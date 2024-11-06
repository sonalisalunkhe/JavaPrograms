package JavaPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0;
		int num2=1;
		
		int n=7;
		
		for(int i=1;i<=n;i++) {
			System.out.print(num1+" ");
			
			int next=num1+num2;
			num1=num2;
			num2=next;
		}

	}

}
