package thiskeyword;

public class ThisAsCurrentClassMethod {
	int a = 67;
	String nn;
	int z = 55;
	static float fgh = 78.34f;
	public static void main(String[] args) {
		ThisAsCurrentClassMethod obj = new ThisAsCurrentClassMethod();
		ThisAsCurrentClassMethod oo = new ThisAsCurrentClassMethod();
		oo.sampleNonStaticMethod();
		obj.a = 909;
		obj.nn = "Welcome to KTCTC";
		obj.fgh = 55.44f;
		obj.sampleNonStaticMethod();

	}
	public void sampleNonStaticMethod() {
		int z = 67;
				System.out.println(z);
				System.out.println(this.z);
		System.out.println(this.a);
		System.out.println(this.nn);
		System.out.println(this.fgh);
		
		this.sam();
		this.staticMethod();
	}

	public static void staticMethod() {
		//System.out.println(this.a);
		//System.out.println(this.nn);
		System.out.println(fgh);

	}
	
	public void sam()
	{
		System.out.println("SM non static method");
		System.out.println(this.nn);
	}
}
