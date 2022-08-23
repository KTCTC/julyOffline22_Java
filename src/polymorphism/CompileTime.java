package polymorphism;

public class CompileTime {
	int a;
	int b;

	public static void main(String[] args) {

CompileTime compileTime =new CompileTime();
compileTime.addition();
compileTime.addition(23,44);
compileTime.addition(23.3f, 23);

	}
	
	public void addition()
	{
		int c = a +b;
		System.out.println("Addition = "+c);
	}
	public void addition(int a)
	{
		int c = this.a +b + a;
		System.out.println("Addition = "+c);
	}
	public static void addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition = "+c);
	}
	
	public static void addition(float a, int b)
	{
		float c = a+b;
		System.out.println("Addition = "+c);
	}
	public static void addition(int a, float b)
	{
		float c = a+b;
		System.out.println("Addition = "+c);
	}
	

}
