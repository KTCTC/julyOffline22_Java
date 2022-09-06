package exceptions;

public class FinaalyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nn = "KTCTC";
		
		try {
			System.out.println(nn.charAt(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("inside catch block");
			
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

}
