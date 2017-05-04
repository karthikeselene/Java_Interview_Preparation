package java_string;

import java.util.Scanner;

public class Count_Vowels_String {
	
	public static void main(String[] args) {
		int vowels = 0;
		String inputLine;
		char ch;
		System.out.println("Please enter a String: ");
		Scanner in = new Scanner(System.in);
		inputLine = in.nextLine();
		for (int i = 0; i < inputLine.length(); i++) {
			ch = inputLine.charAt(i);
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||   
				      ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
				  vowels++;
			  }
		}
		System.out.println("Number of Vowels in the "+inputLine+" is : " + vowels);
		in.close();
	}

}
