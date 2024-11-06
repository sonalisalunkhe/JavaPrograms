package JavaPractice;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,6,7,8,9};
		
		int max=9;
		int cnt=0;
		
		for(int i=1;i<max;i++) {
			if(arr[cnt]==i) {
				cnt++;
			}else {
				System.out.println(i);
			}
		}
		
		

	}

}
