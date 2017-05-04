package operators_example;

public class Preffix_Suffix_Increment_Decrement {
	
	public static void main(String[] args) {
		int i=0,j=0;
		boolean b=((i++==++j && i--==--j));
		System.out.println(b+" "+i);
	}

}
