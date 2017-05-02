package java_string;

import java.util.StringTokenizer;

public class Print_Particular_Word {
	
	String input = "yyyyyHelloyyyy";
	
	public static void main(String[] args) {
		new Print_Particular_Word().printHelloWordUsingSplitMethod();
		new Print_Particular_Word().printHelloWordUsingStringTokenizer_1();
		new Print_Particular_Word().printHelloWordUsingStringTokenizer_2();
	}
	
	public void printHelloWordUsingSplitMethod(){		
		String[] words=input.split("y");
		for (String w : words) {
			if(w.equals("Hello")){
			System.out.println(w);
			}
		}
	}
	
	public void printHelloWordUsingStringTokenizer_1(){
		StringTokenizer stringtokenizer = new StringTokenizer(input, "y");
		while(stringtokenizer.hasMoreTokens()){
			System.out.println(stringtokenizer.nextToken());
		}
	}
	
	public void printHelloWordUsingStringTokenizer_2(){
		StringTokenizer stringtokenizer = new StringTokenizer(input);
		System.out.println(stringtokenizer.nextToken("y"));
	}

}
