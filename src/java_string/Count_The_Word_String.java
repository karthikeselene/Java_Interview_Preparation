package java_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Count_The_Word_String {
	public static void main(String[] args) throws FileNotFoundException {
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		Scanner in = new Scanner(new File("./Output.txt"));
		while(in.hasNext()){
			String word = in.next();
			if(map.containsKey(word)){
				map.put(word, map.get(word)+1);
			}else{
				map.put(word, 1);
			}
		}
		Set<String> output = map.keySet();
		for (String str : output) {
			Integer value = map.get(str);
			System.out.println(str + "--->" + value);
		}
		in.close();
	}
}
