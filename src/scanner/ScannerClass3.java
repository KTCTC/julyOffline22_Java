package scanner;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
	int actualPassword = 4567;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your password");
		int scPass = sc.nextInt();
		if (actualPassword==scPass)
		{
			System.out.println("You have logged in successfully");
		}
		else
		{
			System.out.println("Your password is incorrect");
		}
	
	}

}
