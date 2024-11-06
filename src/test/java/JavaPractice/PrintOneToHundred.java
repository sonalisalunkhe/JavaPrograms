package JavaPractice;

public class PrintOneToHundred {
	static int i=1;

	public static void main(String[] args) {
		
		if(i<=100) {
			
			System.out.println(i);
			i++;
			main(null);
			
		}


	}

}
