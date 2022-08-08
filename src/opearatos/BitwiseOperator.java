package opearatos;

public class BitwiseOperator {

	public static void main(String[] args) {
		// Bitwise Operators
		//   &,^,|
		int a =5; // 0000 0000 0000 0000 0000 0000 0000 0101
		int b = 6;// 0000 0000 0000 0000 0000 0000 0000 0110
		
		int c = a&b;//0000 0000 0000 0000 0000 0000 0000 0100
		System.out.println(c);
		int d = a|b; // 0000 0000 0000 0000 0000 0000 0000 0111
		System.out.println(d);
		
		int e = a^b; // 0000 0000 0000 0000 0000 0000 0000 0011
		System.out.println(e);
		

	}

}
