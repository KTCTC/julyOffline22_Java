package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		sampleMethod1();
		try {
			sampleMethod2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sampleMethod3();
		sampleMethod4();

	}
	
	public static void sampleMethod1() 
	{
		File f = new File("C:\\Users\\91992\\eclipse-workspace\\July22Offline\\JavaFirstProjectJuly\\KTCTC.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("File is not present please add file");
		}
		System.out.println("After file not found exception");
	}
	
	public static void sampleMethod2() 
	{
		try {
			Class.forName("exceptions.UncheckedOrRunTIme");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After class not found exception");
		
	}
	
	public static void sampleMethod3() throws SQLException
	{
		DriverManager.getConnection("127.0.23.34:3306", "root", "KTC1234");
		System.out.println("after sql exception");
		
	}
	
	public static void sampleMethod4() 
	{
		try {
			File f = new File("C:\\Users\\91992\\eclipse-workspace\\July22Offline\\JavaFirstProjectJuly\\KTCTC.xlsx");
			FileInputStream fis = new FileInputStream(f);
			System.out.println("After file not found exception");
			Class.forName("exceptions.UncheckedOrRunTIme");
			System.out.println("After class not found exception");
			DriverManager.getConnection("127.0.23.34:3306", "root", "KTC1234");
			System.out.println("after sql exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
