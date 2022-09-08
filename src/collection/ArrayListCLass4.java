package collection;

import java.util.ArrayList;

public class ArrayListCLass4 {

	public static void main(String[] args) {

		ArrayList<Object> data = new ArrayList<>();
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Amit";		
		Integer a = new Integer(234);
		data.add(a);
		data.add(st1);
		data.add("Welcome to KTCTC");
		
		
		String ss =(String)data.get(2);
		System.out.println(ss);
         
		Object abc = data.get(1);
		
		Student atma = (Student) abc;
		atma.displayStudentInfo();
		
		float fl = 89.45f;
		
		int x;
		x = (int) fl;
		
	}

}
