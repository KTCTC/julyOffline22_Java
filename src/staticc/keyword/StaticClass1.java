package staticc.keyword;

public class StaticClass1 {
int ab = 78;
static int st = 77;

public static void staticMethod()
{
	System.out.println("staticMethod");
	System.out.println(st);
	System.out.println(ab);
	
	}
public static void main(String[] args) {
	StaticClass1.st = 66;
	StaticClass1.staticMethod();
}

}
