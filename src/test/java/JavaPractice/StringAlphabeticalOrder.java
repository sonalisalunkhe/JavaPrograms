package JavaPractice;

import java.util.Arrays;

public class StringAlphabeticalOrder {

	public static void main(String[] args) {
		String name1 = "Sonali";
		String name = name1.toLowerCase();

		char arr[] = name.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = (char) temp;
				}

			}
		}

		System.out.println(Arrays.toString(arr));

		String s = "welcome";

		// char a[]=s.toCharArray();

		String[] a = s.split("");
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

	}

}
