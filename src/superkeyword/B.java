package superkeyword;

public class B extends A{
	int bb = 70;
	static int stBB = 230;
	int ab = 50;
	public B()
	{
		super(45);
		System.out.println(super.aa);
		System.out.println(super.stAA);
		System.out.println(this.bb);
		System.out.println(stBB);
		System.out.println(super.ab);
		System.out.println(super.ab);
	}
	public B(int b)
	{
		
		super(6);
	}
	
	public void nonstaticMethodFromB()
	{
		System.out.println("non static cMethod From B");
		System.out.println(super.aa);
		System.out.println(super.stAA);
		System.out.println(this.bb);
		System.out.println(stBB);
		System.out.println(super.ab);
		System.out.println(super.ab);
		super.nonstaticMethodFromA();
		super.staticMethodFromA();
	}
	public static void staticMethodFromB()
	{
		System.out.println("static Method From B");
	//	System.out.println(super.aa);
		//System.out.println(super.stAA);
		//System.out.println(bb);
		System.out.println(stBB);
		//System.out.println(super.ab);
	}
	
	public static void main(String[] args) {
		B ob = new B();
		ob.nonstaticMethodFromB();
	}

}
