package print_format;

import java.util.Scanner;

public class Pascal_Triangle {
	
	public static void main(String[] args) {
		int number;
		int i, j ,k;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of rows for printing Pascal's Triangle : ");
		int row = in.nextInt();
		for (i = 0; i < row; i++) {
			for (j = row; j > i; j--) {
				System.out.print(" ");
			}
			number = 1;
			for (k = 0; k <= i; k++) {
			  System.out.print(number+" ");	
			  number = number * (i-k) / (k+1);
			}
			System.out.println();			
		}		
		in.close();		
	}

}
