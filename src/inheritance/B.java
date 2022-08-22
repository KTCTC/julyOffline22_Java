package inheritance;

public class B extends A{
	int bb =5;
	static int stBB = 34;
	public B()
	{
		System.out.println("B constructor");
	}
	public void nonStaticMethodFromB()
	{
		System.out.println("non Static Method From B");
	}
	public static void staticMethodFromB()
	{
		System.out.println("Static Method From B");
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
		A.stAA = 78;
		A.staticMethodFromA();
		B.stAA = 89;
		B.stBB = 56;
		B.staticMethodFromB();
		B.staticMethodFromA();
	}

}
