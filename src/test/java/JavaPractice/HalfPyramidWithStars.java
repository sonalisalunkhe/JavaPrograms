package JavaPractice;

public class HalfPyramidWithStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=5;
		
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();

		}
		//char E = 0, A = 0;
		System.out.println('E'-'A');

		

		int row1=5;
		
		for(int i=row1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
		
		//int row1=5;
		
		for(int i=row1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");

			}
			System.out.println();

		}
		
		int number=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
					number++;
			}
			System.out.println();

		}
	}

}
