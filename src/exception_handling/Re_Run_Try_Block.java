package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Re_Run_Try_Block {
	
	Scanner sc;
	int numOpponents = 0;	
	
	public static void main(String[] args) {
	      new Re_Run_Try_Block().setUpPlayers();
	}
	
	public void setUpPlayers() { 
		   sc = new Scanner(System.in);
	       System.out.println("So whats your name?");
	       String name = sc.nextLine();	      
	       System.out.println("Hi " +name+ ". How many opponents would you like to play against?");
	       try{
	       numOpponents = sc.nextInt();
	       System.out.println("Form Submitted Successfully!!!");
	       }catch(InputMismatchException e){
	           System.out.println("Sorry, numbers only!");
	           setUpPlayers();
	       }	       
	}  
	
}
