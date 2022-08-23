package polymorphism;

public class C extends B{
	int aa = 2222;
	static int stAA = 3333;
	
	public void addition()
	{
		int c = aa+stAA;
		System.out.println("Addition is = "+c);
		System.out.println("Addition method from C");
	}
	
	public static void substraction()
	{
	int c =stAA-55;
	System.out.println("substraction = "+c);
	System.out.println("Substraction method from C");
		
	}
	public void sm(int a)
	{
		System.out.println("Sm method from C");
	}
	public static void main(String[] args) {
		B bc = new C();
		bc.addition();
		bc.sm();
		
		
		A ac = new C();
		ac.addition();
		ac.sm();
		
		A ab = new B();
		ab.sm();
		ab.addition();
		
		
		B bb = new B();
		
		bb.addition();
		bb.sm();
		
		
		A aa = new A();
		
		aa.addition();
		aa.sm();
		C cc = new C();
		cc.addition();
		cc.sm();
		cc.sm(34);
		
	}
	

}
