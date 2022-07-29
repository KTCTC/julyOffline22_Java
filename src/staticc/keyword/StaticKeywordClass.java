package staticc.keyword;

public class StaticKeywordClass {
	
	int abcd = 90;
	static int pqrs = 55;
	
	public void nonStaticMethod()
	{
		int a = 89;
		System.out.println("non Static Method");
		System.out.println(a);
		System.out.println(abcd);
		System.out.println(pqrs);
	}
	
	public static void staticMethod()
	{
		int b = 90;
		System.out.println("static Method");
		System.out.println(b);
	   System.out.println(abcd);
		System.out.println(pqrs);
	}
	
	public static void main(String[] args) {
		System.out.println(StaticKeywordClass.pqrs);
		StaticKeywordClass.staticMethod();
		StaticKeywordClass obj = new StaticKeywordClass();
		StaticKeywordClass obj1 = new StaticKeywordClass();
		obj.abcd = 444;
		obj.nonStaticMethod();
		obj1.nonStaticMethod();
		//System.out.println(abcd);
	}

}
