package thiskeyword;

public class ThisAsInstanceVariable {
	int a = 67;
	String nn;
	int z = 55;
	static float fgh = 78.34f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsInstanceVariable obj = new ThisAsInstanceVariable();
		obj.a = 90;
		obj.nn = "KTCTC";
		obj.fgh = 44.44f;

		obj.sampleNonStaticMethod();
	}

	public void sampleNonStaticMethod() {
		int z = 67;
				System.out.println(z);
				System.out.println(this.z);
		System.out.println(this.a);
		System.out.println(this.nn);
		System.out.println(this.fgh);
	}

	public static void staticMethod() {
		System.out.println(this.a);
		System.out.println(this.nn);
		System.out.println(this.fgh);

	}

}
