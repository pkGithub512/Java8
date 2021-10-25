package mix.questions;
//Given a string 
		// 1) find the Second Non-repeating character
		// 2) If not present, give the First Non-repeating character
		// 3) If all characters are repeating return null
		//
		//Example:
		//Input: ELEPHANT
		//Output:P
//
//Input: MALAYALAM
//Output:Y
import java.util.LinkedHashMap;
import java.util.Map;


public class FindRepeatedCharacterInString {

	public static void main(String[] args) {
		String str = "ELEPHANT";
		  char[] arr = str.toCharArray();
		  
		  LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		  
		  for(int i=0; i< arr.length; i++){
		      if(map.containsKey(arr[i])){
		        map.put(arr[i], map.get(arr[i])+1);
		      }else{
		        map.put(arr[i], 1);
		      }    
		  }
		  int count = 0;
		  int repeatedCount=0;
		  for(Map.Entry element : map.entrySet()){
		      //First condition
		      if((int)element.getValue()==1){
		        count++;
		        if(count==2){
		          System.out.println("Condition 1 " + element);
		        }
		      }
		      if((int)element.getValue()>1){
		    	  repeatedCount++;
		      }
		  }
		  //Second condition
		  if(count==1){
		    for(Map.Entry element : map.entrySet()){
		      if((int)element.getValue()==1){
		    	  System.out.println("Condition 2 " + element);
		      }
		    }
		  }
		  //Third Condition
		  if(repeatedCount==map.entrySet().size()){
			  System.out.println("All are rpeating");
		  }
		
	}
}
