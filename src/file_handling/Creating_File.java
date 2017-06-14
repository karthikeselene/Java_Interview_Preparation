package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Creating_File {

	public static void main(String[] args) {	
		Creating_File cf = new Creating_File();
		cf.justCreateFileAlone("File");
		cf.createFileWithDataUsingFOS("name", "Karthikeyan Rajendran");
		cf.createFileWithDataUsingNIO("address", "Plot No. 42A Balammal Nagar Main Road");
	}
	
	public void justCreateFileAlone(String fileName){
		File file = new File(fileName+".txt");
		try {
			boolean status = file.createNewFile();
			if(status){
				System.out.println("The file was created successfully in the "+file.getAbsolutePath());
			}else{
				System.out.println("The file was already exist in the "+file.getAbsolutePath());
			}			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	public void createFileWithDataUsingFOS(String fileName,String fileData){
		try {
			FileOutputStream fos = new FileOutputStream(fileName+".txt");
			fos.write(fileData.getBytes());
			fos.flush();
			fos.close();
			System.out.println("Successfully created a file with data!!!");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void createFileWithDataUsingNIO(String fileName,String fileData){
		try {
			Files.write(Paths.get(fileName+".txt"), fileData.getBytes());
			System.out.println("Successfully created a file with data!!!");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

}
