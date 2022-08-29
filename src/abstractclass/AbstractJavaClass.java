package abstractclass;

public abstract class AbstractJavaClass extends ParentAbstractClass{
	
	public AbstractJavaClass(int a)
	{
		
	}
	

	public void nonStaticMethod()
	{
		System.out.println("Non static method from Abstract class");
	}
	public static void staticMethod()
	{
		System.out.println("Static method from Abstract class");
	}
	
	public abstract void abstractMethod();

	

}
