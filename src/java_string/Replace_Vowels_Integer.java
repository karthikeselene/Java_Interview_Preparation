package java_string;

import java.util.Scanner;

public class Replace_Vowels_Integer {
	
	public static void main(String[] args) {
		String inputString;
		System.out.println("Please enter a String: ");
		Scanner in = new Scanner(System.in);
		inputString = in.nextLine();
		char[] strArray = inputString.toCharArray();
		for(int i = 0;i < strArray.length;i++){
			if(strArray[i] == 'a' || strArray[i] == 'A'){
				strArray[i] = '1';
			}else if(strArray[i] == 'e' || strArray[i] == 'E'){
				strArray[i] = '2';
			}else if(strArray[i] == 'i' || strArray[i] == 'I'){
				strArray[i] = '3';
			}else if(strArray[i] == 'o' || strArray[i] == 'O'){
				strArray[i] = '4';
			}else if(strArray[i] == 'u' || strArray[i] == 'U'){
				strArray[i] = '5';
			}
		}
		String output = new String(strArray);
		System.out.println(output);
		in.close();
	}

}
