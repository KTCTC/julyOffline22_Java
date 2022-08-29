package abstractclass;

public class A extends AbstractJavaClass{

public A()
{
	super(23);
	}

@Override
public void abstractMethod() {
	System.out.println("Implemented by A class");
	
}

public static void main(String[] args) {
	
	AbstractJavaClass ab = new A();
	ab.abstractMethod();
	ab.nonStaticMethod();
	ab.staticMethod();
	
	A aa = new A();
	aa.abstractMethod();
	aa.nonStaticMethod();
	aa.staticMethod();
}

@Override
public void parentClassAbstractMethod() {
	System.out.println("parent Class Abstract Method implemented by A class");
	
}
}
