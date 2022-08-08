package opearatos;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternery Operators (if-then-else)
		//  ? :

		boolean flag = true;
		int a = 3;
		int age = 18;
		
		String ss = (age>=18)?"You are eligible for voting":"You are not eligible for voting";
		System.out.println(ss);
		
		 char c = (a>2)?'A':'B';
		 System.out.println(c);
		
		int b = (a>2)?45:56;		
		
		String str = flag?"Yes":"No";
		System.out.println(str);
		
	
	}

}
