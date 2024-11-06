package JavaPractice;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountWordsInString {
	
	public static void main(String args[]) {
		
		
		String str="I am Sonali and I like cooking like";
		
		
		String strarr[]=str.split(" ");
		
		System.out.println("Count of words in strings is ::"+ strarr.length);
		
		
		HashMap<String, Integer> map=new HashMap<>();
		
		for(int i=0;i<strarr.length;i++) {
			
			if(map.containsKey(strarr[i])) {
				
				int count=map.get(strarr[i]);
				map.put(strarr[i], count+1);
				
			}
			else
			{
				map.put(strarr[i],1);
			}
		}
		System.out.println("Duplicate words with occurances are::");

		for(Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ ":"+entry.getValue());

			}
		}
	}

}
