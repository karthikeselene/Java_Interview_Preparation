package java_string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Most_Repeating_Character_Two {
	
	public static void main(String[] args) {
		duplicateCharCount("Cognizant");
	}
	
	static void duplicateCharCount(String inputString){
		char[] strArray = inputString.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (char c : strArray) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		int maxValueInMap = Collections.max(map.values());		
		Set<Character> charsInString = map.keySet();
		for (Character ch : charsInString) {
			if(map.get(ch) == maxValueInMap){
				System.out.println("the max char is : " + ch + "  and displayed  " +maxValueInMap+ "  times");
			}
		}
	}

}
