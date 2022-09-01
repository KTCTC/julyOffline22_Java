package finalkeyword;

public final class FinalClass {
	public final int a;
	final static int staa;
	
	public FinalClass(int a)
	{
		this.a = a;
		
	}
	public FinalClass()
	{
		a = 55;	
		
	}
	static {
		staa =78;
		System.out.println("Inside static bloack");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass obj = new FinalClass(34);
		FinalClass oo = new FinalClass(23);
		int z = obj.a;
		//obj.a = 66666;
		//obj.staa = 798776;
		//FinalClass.staa = 34;

	}
	
	public final void nonStaticMethod()
	{
		System.out.println("non Static Method");
	}
	public static final void staticMethod()
	{
		System.out.println("Static Method");
	}
	
	public void sm()
	{
		System.out.println("SM from Final class");
	}

}
