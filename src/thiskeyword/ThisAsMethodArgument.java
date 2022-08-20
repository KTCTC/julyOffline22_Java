package thiskeyword;

public class ThisAsMethodArgument {

	int a = 6;
	String np;

	public static void main(String[] args) {
		ThisAsMethodArgument obj = new ThisAsMethodArgument();
		obj.sampleNonstaticMethod();

	}

	public void sampleNonstaticMethod() {
		sm(this);
		System.out.println(this.a);
	}

	public static void sm(ThisAsMethodArgument obj) {
		obj.a = 888;
		obj.np = "ABCD";
	}

}
