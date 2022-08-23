package polymorphism;

public class B extends A{
	int aa = 900;
	static int stAA = 888;
	
	public void addition()
	{
		int c = aa+stAA + 555;
		System.out.println("Addition is = "+c);
		System.out.println("Addition method from B");
	}
	
	public static void substraction()
	{
	int c =stAA-55+6789;
	System.out.println("substraction = "+c);
	System.out.println("Substraction method from B");
		
	}
	public void sm()
	{
		System.out.println("Sm method from B");
	}
	
	public static void main(String[] args) {
		
		A ab = new B();
		System.out.println(ab.aa);
		System.out.println(ab.stAA);
		ab.addition();
		ab.substraction();
		
		B bb = new B();
		System.out.println(bb.aa);
		System.out.println(bb.stAA);
		bb.addition();
		bb.substraction();
		
		A aa = new A();
		System.out.println(aa.aa);
		System.out.println(aa.stAA);
		aa.addition();
		aa.substraction();
	}
	

}
