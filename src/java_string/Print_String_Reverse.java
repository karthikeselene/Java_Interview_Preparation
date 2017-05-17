package java_string;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Print_String_Reverse {
	
	public static void main(String[] args) {
		System.out.println("Please enter a string to reverse: ");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		stringReverseUsingReverseMethodStringBuilderClass(word);
		System.out.println();
		stringReverseUsingReverseMethodStringBufferClass(word);		
		stringReverseWithoutReverseMethod(word);
		System.out.println();
		stringReverseBySwapTheChar(word);
		System.out.println();
		stringReverseUsingList(word);
		System.out.println();
		stringReverseUsingBytes(word);
		in.close();
	}
	
	static void stringReverseUsingReverseMethodStringBuilderClass(String word){		
		StringBuilder input = new StringBuilder();
		input.append(word);
		input.reverse();
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));
		}		
	}
	
	static void stringReverseUsingReverseMethodStringBufferClass(String word){		
		StringBuffer input = new StringBuffer(word);
		input.reverse();
		System.out.println(input);		
	}
	
	static void stringReverseWithoutReverseMethod(String word){
		char[] strArray = word.toCharArray();
		for(int i=strArray.length-1;i>=0;i--){
			System.out.print(strArray[i]);
		}
	}
	
	static void stringReverseBySwapTheChar(String word){
		char[] temparray = word.toCharArray();
		int left,right = 0;
		right = temparray.length-1;
		for(left = 0; left < right; left++, right--){
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}
		for(char c : temparray) {
			System.out.print(c);
		}
	}
	
	static void stringReverseUsingList(String word){
		char[] strArray = word.toCharArray();
		List<Character> list = new LinkedList<Character>();
		for (Character ch : strArray) {
			list.add(ch);
		}
		Collections.reverse(list);
		ListIterator<Character> li = list.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}
	}
	
	static void stringReverseUsingBytes(String word){
		byte[] strAsByteArray = word.getBytes();
		byte[] result = new byte[strAsByteArray.length];
		for(int i = 0;i < strAsByteArray.length;i++){
			result[i] = strAsByteArray[strAsByteArray.length-i-1];
		}
		System.out.println(new String(result));
	}

}
