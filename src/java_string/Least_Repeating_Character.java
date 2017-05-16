package java_string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Least_Repeating_Character {
	
	public static void main(String[] args) {
		duplicateCharCount("jaaavvvaaa");
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
		int minValueInMap = Collections.min(map.values());		
		Set<Character> charsInString = map.keySet();
		for (Character ch : charsInString) {
			if(map.get(ch) == minValueInMap){
				System.out.println("the least repeating char is : " + ch + "  and displayed  " +minValueInMap+ "  times");
			}
		}
	}

}
