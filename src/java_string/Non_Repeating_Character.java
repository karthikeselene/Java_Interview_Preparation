package java_string;

import java.util.HashMap;
import java.util.Scanner;

public class Non_Repeating_Character {
	
	public static void main(String[] args) {
		System.out.println("Please enter a String: ");
	    Scanner in = new Scanner(System.in);
        String word =  in.nextLine();
        HashMap<Character,Integer>  characterhashtable = new HashMap<Character ,Integer>();
        int i,length ;
        Character c = null ;
        length = word.length();
        for (i=0;i < length;i++)
        {
            c=word.charAt(i);
            if(characterhashtable.containsKey(c))
            {
               characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        for (i =0 ; i < length ; i++ )
        {
            c= word.charAt(i);
            if( characterhashtable.get(c)  == 1 ){
            System.out.print(c);
            break;
            }
        }        
        in.close();
	}

}
