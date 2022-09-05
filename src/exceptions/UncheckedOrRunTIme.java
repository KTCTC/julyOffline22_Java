package exceptions;

import misce.Student;

public class UncheckedOrRunTIme {
	static int a;
	static Student obj;

	public static void main(String[] args) {
		
		String data = "Welcome to KTCTC";
		
		char ch = data.charAt(44);
		System.out.println(ch);
		
		int arr[] = {34,45,56,78};
		arr[44] = 90;
		System.out.println(arr[567]);
		
		String val = "345.5676";
		
		int d = Integer.parseInt(val);
		System.out.println(d);

		String str = null;
		System.out.println(str.length());
		obj.sampleMethodFromStudent();

		int a = 4;
		int b = 0;

		int c = a / b;

		System.out.println(c);
		System.out.println("After exception");

	}

}
