package staticc.keyword;

public class StaticClass2 {
	int cb = 44;
	static int nm = 55;

	public static void main(String[] args) {
		StaticClass2 obj = new StaticClass2();
		StaticClass2 obj1 = new StaticClass2();
		obj.cb =999;
		obj1.cb = 555;
		obj.nonStaticMethod();
		obj1.nonStaticMethod();

	}
	
	public void nonStaticMethod()
	{
		System.out.println("non Static Method");
		System.out.println(cb);
		System.out.println(nm);
	}

}
