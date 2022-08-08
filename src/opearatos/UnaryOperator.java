package opearatos;

public class UnaryOperator {
public static void main(String[] args) {
	//Unary operator
	   //exp++,exp--,++exp,--exp,~,!
	int a = 50;//
	int z = 34;//
	int x = 5;
	boolean bb = false;
	boolean cc = !bb;
	System.out.println(cc);
	System.out.println(bb);
	
	int y = ~x;// y = x*-1 -1;
	System.out.println(y);
	System.out.println(x);
	
	int g = --a+--z+--a-++z+a++;//144
	System.out.println(g);
	int f = a++-++z-a--; // 50-35-51
	System.out.println(f); // -16,
	
	int e = a--;
	System.out.println(e);
	System.out.println(a);
	
	int d = --a;
	System.out.println(d);
	System.out.println(a);
	
	int c = ++a;
	System.out.println(c);
	System.out.println(a);
	
	int b = a++;
	System.out.println(b);
	System.out.println(a);
}
}
