package opearatos;

public class AssignmentOperator {

	public static void main(String[] args) {
		// Assignment Operators
		//   = ,+= ,-= ,*= ,/= ,%= , <<= ,>>=
		
		int a = 67;
		int b = 78;
		
		a>>=3; // a = a>>3; a = a/2^3;
		System.out.println(a);
		a<<=2; // a = a<<2;  a = a*2^2;
		System.out.println(a);
		
		a%=3;// a = a%3;
		System.out.println(a);
		
		b/=5;// b = b/5;
		System.out.println(b);
		
		b*=2; // b = b*2;
		System.out.println(b);
		
		b-=4; // b = b-4;
		System.out.println(b);
		
		
		a+=34; // a = a+34;
		System.out.println(a);

	}

}
