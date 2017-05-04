package java_string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Text_From_File {
	
	public static void main(String[] args) {
		String line;
		try {
			FileReader reader = new FileReader("./input.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
