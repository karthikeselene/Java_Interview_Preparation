package print_format;

import java.util.Scanner;

public class Number_Diamond_Pattern {
	
	public static void main(String[] args) {
		int noOfRows, midRow;
		int row = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("How Many Rows You Want In Your Diamond? ");
		noOfRows = in.nextInt();
		midRow = noOfRows/2;
		for (int i = midRow; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= row; k++) {
				  System.out.print(row+" ");					 
				}
				System.out.println();
				row++;
		}	
		for (int i = 0; i <= midRow; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = row; k > 0; k--) {
				  System.out.print(row+" ");					 
				}
				System.out.println();
				row--;
		}
		in.close();
	}

}
