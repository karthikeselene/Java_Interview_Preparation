package java_string;

import java.util.Scanner;

public class Most_Repeating_Character_One {
	
	public static void main (String[] args){    
	   
		   String word;
	       int characterCount;
	       int maxCharacter = 0;
	       char maxCharacterChar = ' ';	       
	       
	       System.out.println("Please enter a String: ");
	       Scanner in = new Scanner(System.in);
           word =  in.nextLine();
	       char[] cArray = word.toCharArray();
	       for(int i = 0; i < cArray.length; i++)
	        {
	            int characterASCII = (int)cArray[i];	            
	            characterCount = 0;	            
	            for(int x = 0; x < cArray.length; x++)
	            {
	            	if(characterASCII == (int)cArray[x])
	                {
	                	characterCount ++;	                    
	                    if(characterCount > maxCharacter)
	                    {
	                        maxCharacter = characterCount;
	                        maxCharacterChar = cArray[i];
	                    }	                    
	                }
	            }
	        }	      
	     System.out.println("The most repeating character in the string "+word+" is : "+maxCharacterChar);
	     System.out.println("The number of time character "+maxCharacterChar+" is repeating in "+word+" is : "+maxCharacter);
         in.close();  
	  }

}
