package JavaPractice;

public class ReverseSentenceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to Java programming";
		
		
		String[] temp=str.split(" ");
		String result="";
		
		for(int i=0;i<temp.length;i++) {
			if(i==temp.length-1) {
				result=temp[i]+result;
				
			}else {
				
				result=" "+temp[i]+result;
			}
			
		}
		System.out.println(result);

		String[] temp1=str.split(" ");
		String result1="";
		for(int i=0;i<temp1.length;i++) {
				result1=" "+temp[i]+result1;
				
			
			
		}
		System.out.println(":"+result1);
	}

}
