package inheritance;

public class C extends B{
	int cc =5;
	static int stCC = 34;
	public C()
	{
		System.out.println("C constructor");
	}
	public void nonStaticMethodFromC()
	{
		System.out.println("non Static Method From C");
	}
	public static void staticMethodFromC()
	{
		System.out.println("Static Method From C");
	}
	public static void main(String[] args) {
		C oc = new C();
		oc.aa = 45;
		oc.bb =42;
		oc.cc = 22;
		oc.stAA = 34;
		oc.stBB = 56;
		oc.stCC = 22;
		
		oc.staticMethodFromA();
		oc.staticMethodFromB();
		oc.staticMethodFromC();
		oc.nonStaticMethodFromA();
		oc.nonStaticMethodFromB();
		oc.nonStaticMethodFromC();
		
		
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
