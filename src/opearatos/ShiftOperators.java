package opearatos;

public class ShiftOperators {

	public static void main(String[] args) {
		// Shift Operators
		//   <<,>>
		
		int a =5; // 0000 0000 0000 0000 0000 0000 0000 0101
		int b = 6;// 0000 0000 0000 0000 0000 0000 0000 0110
		
		int c = a<<5; // 00 0000 0000 0000 0000 0000 0000 010100 // 2^3 * number
		//37%32 = 5		
		System.out.println(c);
		
		int d = b>>2; // 000000 0000 0000 0000 0000 0000 0000 01 // number/2^2
		System.out.println(d);
		
		

	}

}
