package com.qa.JavaPrograms;
import java.util.HashMap;
import java.util.Map.Entry;
public class CountDuplicatesCharacters {
	
	public static void main(String args[]) {
		
		String str1="welcomecome";
		
		for(int i=0;i<str1.length();i++)
		{


			for(int j=i+1;j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					System.out.println(str1.charAt(i));

					break;
				}

				

			}

		}

		
		
		
String str="welcomecome";
        
        char arr[]=str.toCharArray();
        
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            //char ch=str.charAt(i);
            if(map.containsKey(arr[i]))
            {
                int c=map.get(arr[i]);
                map.put(arr[i],c+1);
            }
            else
            {
                map.put(arr[i],1);
            }
           
        }
        
		System.out.println(map);

        
        for(Entry<Character, Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1){
                        System.out.println(entry.getKey()+":"+entry.getValue());


            }
        }
	}

}
