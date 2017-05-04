package datatype_examples;

public class Primitive_DataType {
	
	int a; int[] b;
	public void f(){
		a = 0;
		b = new int[]{1,2};
		change(b, a);
		System.out.println(a+ " " +b[0]+ " " );
	}
	public void change(int[] x,int y){
		y = 10;
		x[0] = 10;
	}
	
	public static void main(String[] args) {
		Primitive_DataType obj = new Primitive_DataType();
		obj.f();
	}

}
