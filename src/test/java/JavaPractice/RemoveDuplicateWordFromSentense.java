package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWordFromSentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="welcome to pune welcome to mumbai welcome to delhi";
		
		String[] words=str.split(" ");
		
		Set<String> wordset=new HashSet<>();
		
		StringBuilder result=new StringBuilder();
		
		for(String word:words) {
			if(!wordset.contains(word)) {
				wordset.add(word);
				
				result=result.append(word).append(" ");
			}
		}
		
		System.out.println(result);

	}

}
