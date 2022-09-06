package exceptions;

import java.sql.SQLException;

public class ThrowKeyword {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		int age = 2;
		
		if (age<18)
		{
			System.out.println("You can not vote");
			int a = 90;
			ArithmeticException obj = new ArithmeticException();
			throw new SQLException();
		}
		else 
		{
			System.out.println("You can vote");
		}

	}
	
	

}
