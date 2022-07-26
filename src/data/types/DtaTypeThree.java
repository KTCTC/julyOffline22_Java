package data.types;

public class DtaTypeThree {
	
	static int ab;
	static float stVari = 88.23f;
	int nonStVari;

	public static void main(String[] args) {
		int a =90;
		System.out.println(a);
		System.out.println(ab);
		System.out.println(stVari);
		
		methodTwo();

	}
	public static void methodOne()
	{
		float fl = 78.23f;
		System.out.println(fl);
		methodTwo();
	
		
	}
	
	public static void methodTwo()
	{
		System.out.println("Method two");
		
	}
	public  void methodThree()
	{
		System.out.println("Method three");
		char ch = 'r';
		System.out.println(ch);
		
	}

}
