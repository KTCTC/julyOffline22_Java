package inheritance;

public class D extends A{
	int dd =5;
	static int stDD = 34;
	
	public void nonStaticMethodFromD()
	{
		System.out.println("non Static Method From D");
	}
	public static void staticMethodFromD()
	{
		System.out.println("Static Method From D");
	}
	
	
	public static void main(String[] args) {
		D od = new D();
		od.aa = 45;
		od.dd =67;
		
		od.stAA = 34;
		
		
		od.staticMethodFromA();
		
		
		od.nonStaticMethodFromA();
		
		
	}

}
