package exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {
		int a = 89;
		int b = 0;
		int c = 0;
		String nn = "34rt";
		int z = 0;
		
		 try {
			
			
			try {
				z = Integer.parseInt(nn);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				z = 99;
			}
			
			c = a/b;
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			try {
				c = a/z;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

	}

}
