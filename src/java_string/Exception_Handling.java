package java_string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
	
	Scanner sc;
	int numOpponents = 0;	
	
	public static void main(String[] args) {
	      new Exception_Handling().setUpPlayers();
	}
	
	public void setUpPlayers() { 
		   sc = new Scanner(System.in);
	       System.out.println("So whats your name?");
	       String name = sc.nextLine();	      
	       System.out.println("Hi " +name+ ". How many opponents would you like to play against?");
	       try{
	       numOpponents = sc.nextInt();
	       }catch(InputMismatchException e){
	           System.out.println("Sorry, numbers only!");
	           setUpPlayers();
	       }
	       System.out.println("Form Submitted Successfully!!!");
	}  
	
}
