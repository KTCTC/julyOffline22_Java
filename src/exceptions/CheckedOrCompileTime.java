package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedOrCompileTime {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException, Exception {
		// TODO Auto-generated method stub
		sampleMethod1();
		sampleMethod2();
		sampleMethod3();
		sampleMethod4();

	}
	
	public static void sampleMethod1() throws FileNotFoundException
	{
		File f = new File("C:\\Users\\91992\\eclipse-workspace\\July22Offline\\JavaFirstProjectJuly\\KTCTC.xlsx");
		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception");
	}
	
	public static void sampleMethod2() throws ClassNotFoundException
	{
		Class.forName("exceptions.UncheckedOrRunTIme");
		System.out.println("After class not found exception");
		
	}
	
	public static void sampleMethod3() throws SQLException
	{
		DriverManager.getConnection("127.0.23.34:3306", "root", "KTC1234");
		System.out.println("after sql exception");
		
	}
	
	public static void sampleMethod4() throws Exception
	{
		File f = new File("C:\\Users\\91992\\eclipse-workspace\\July22Offline\\JavaFirstProjectJuly\\KTCTC.xlsx");
		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception");
		Class.forName("exceptions.UncheckedOrRunTIme");
		System.out.println("After class not found exception");
		DriverManager.getConnection("127.0.23.34:3306", "root", "KTC1234");
		System.out.println("after sql exception");
		
	}

}
