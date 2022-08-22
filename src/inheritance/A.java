package inheritance;

public class A {
	int aa =5;
	static int stAA = 34;
	public A()
	{
		System.out.println("A constructor");
	}
	
	public void nonStaticMethodFromA()
	{
		System.out.println("non Static Method From A");
	}
	public static void staticMethodFromA()
	{
		System.out.println("Static Method From A");
	}
	public static void main(String[] args) {
		B ob = new B();
		ob.aa = 89;
		ob.bb = 77;
		ob.nonStaticMethodFromA();
		ob.nonStaticMethodFromB();
		System.out.println(ob.stAA);
		System.out.println(ob.stBB);
		ob.staticMethodFromA();
		ob.staticMethodFromB();
		
		A oa = new A();
		oa.aa = 78;
		oa.stAA = 56;
		oa.nonStaticMethodFromA();
		oa.staticMethodFromA();
	}

}
