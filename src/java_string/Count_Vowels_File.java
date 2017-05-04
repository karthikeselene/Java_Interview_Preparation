package java_string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Count_Vowels_File {
	
	public static void main(String[] args) {
		String line;
		int vowels = 0;		
		try {
			FileReader reader = new FileReader("./input.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			while((line = bufferedReader.readLine()) != null){
				for(int i = 0; i < line.length(); i ++){
					char ch = line.charAt(i);
					  if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||   
						      ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
						  vowels++;
					  }
				}				
			}
			System.out.println("Vowels : " + vowels);
			reader.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
