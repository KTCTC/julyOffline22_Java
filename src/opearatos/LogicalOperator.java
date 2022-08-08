package opearatos;

public class LogicalOperator {

	public static void main(String[] args) {
		//  Logical operators
		 //  && , ||
		
		boolean f1 = true;
		boolean f2 = true;
		int a = 3;
		int b = 78;
		
		boolean flag = f1&&f2||(a<b);
		
		System.out.println(flag);
		
		boolean f3 = f1&&!(a<b);
		System.out.println(f3);
		
		boolean f4 = f1 & (a<b);
		System.out.println(f4);
		

	}

}
