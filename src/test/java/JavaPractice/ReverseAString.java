package JavaPractice;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome";
		String str1 = "";

		for (int i = 0; i < str.length(); i++) {
			str1 = str.charAt(i) + str1;

		}

		System.out.println(str1);
	}

}
