package opearatos;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// Arithmatic operator +,-,*,/,%
		String str1 = "Welcome89";
		String str2 = "ABCD";
		int x = 89;
		int y = 44;
		System.out.println("Hello"+x*y);
		System.out.println("Hello"+(x+y));
		System.out.println(x+y+str2);
		System.out.println("Hello"+x+y);
		System.out.println(x+y);
		System.out.println(str1+y);

		String str3 = str1 + str2;
		System.out.println(str3);
		String str4 = str1+89;
		System.out.println(str4);
		
		int a = 45;
		int b = 21;
		float fl = 45.3f;
		float z = 22.0f;
		float l = fl % z;
		System.out.println(l);

		int k = a % b;
		System.out.println(k);

		System.out.println("Devision----------------------------");
		float j = fl / a;
		System.out.println(j);
		int i = a / b;
		System.out.println(i);

		System.out.println("Multiplication----------------------------");
		int g = a * b;
		System.out.println(g);
		float h = fl * b;
		System.out.println(h);

		System.out.println("Substraction----------------------------");
		int e = a - b;
		System.out.println(e);
		float f = fl - b;
		System.out.println(f);
		System.out.println("Addition----------------------------");
		int c = a + b;
		System.out.println(c);
		float d = a + fl;
		System.out.println(d);

	}

}
