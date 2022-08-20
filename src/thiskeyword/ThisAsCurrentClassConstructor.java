package thiskeyword;

public class ThisAsCurrentClassConstructor {
	int a = 5;
	String nn;
	
	public ThisAsCurrentClassConstructor()
	{
		this(22,"KTCTC");
		System.out.println("Default constructor");
		
	}
	public ThisAsCurrentClassConstructor(int a)
	{
		
	this.a = a;
	System.out.println("This is single param constructor");
		
	}
	public ThisAsCurrentClassConstructor(int a, String nn)
	{
		this(23);
		this.a = a;
		this.nn = nn;
		System.out.println("This is two param constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsCurrentClassConstructor obj = new ThisAsCurrentClassConstructor(12, "Hi");
		ThisAsCurrentClassConstructor oo = new ThisAsCurrentClassConstructor();

	}
	

}
