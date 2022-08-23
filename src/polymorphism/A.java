package polymorphism;

public class A {
	int aa = 90;
	static int stAA = 88;
	
	public void addition()
	{
		int c = aa+stAA;
		System.out.println("Addition is = "+c);
		System.out.println("Addition method from A");
	}
	
	public void sm()
	{
		System.out.println("Sm method from A");
	}
	
	public static void substraction()
	{
	int c =stAA-55;
	System.out.println("substraction = "+c);
	System.out.println("Substraction method from A");
		
	}
	

}
