package JavaPractice;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;


public class FindUniqueNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int arr[]= {4,3,2,7,3,4,8};
		  
		  
		  
		  
		  Set<Integer> set=new  HashSet<>();
		  
		  for(int  i:arr) {
			  if(!set.contains(i)) {
				  set.add(i);
			  }
		  }
		  System.out.println(set);
		  
		  //---------
		  
		  HashMap<Integer, Integer> hmap=new HashMap<>();
		  
		  for(int i=0;i<arr.length;i++) {
			  if(hmap.containsKey(arr[i])) {
				  hmap.put(arr[i],hmap.get(arr[i])+1);
			  }else
			  {
				  hmap.put(arr[i],1);
			  }
		  }
		  System.out.println(hmap);
		  
		  for(Entry<Integer, Integer> entry:hmap.entrySet())
		  {
			  if(entry.getValue()==1) {
				  System.out.println("Unique:::"+entry.getKey());

			  }
		  }
		  
	}

}
