package JavaPractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterOccuranceInString {
	
	public static void main(String args[]) {
		
		String str="My name is sonali salunkhe";
		System.out.println("Length of String"+str.length());

		
		char carr[]=str.toCharArray();
		
		System.out.println("Length of array:"+carr.length);
		System.out.println(carr);

		
		for(char c:carr) {
			System.out.println("Print array with for loop:"+c);

		}
		
		
		Map<Character, Integer> hmap=new HashMap<>();
		
		for(int i=0;i<carr.length;i++) {
			
			if(hmap.containsKey(carr[i])) {
				
				int c=hmap.get(carr[i]);
				hmap.put(carr[i],c+1);
				
			}else {
				hmap.put(carr[i],1);

			}
		}
		
		System.out.println("Occurances"+hmap.toString());
		
		
		System.out.println("Duplicate Characters:");
		for(Entry<Character, Integer> entry:hmap.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}
		System.out.println("First non Duplicate Characters:");

		for(Entry<Character, Integer> entry:hmap.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
