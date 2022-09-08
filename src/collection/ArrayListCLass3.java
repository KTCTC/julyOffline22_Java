package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCLass3 {

	public static void main(String[] args) {

		ArrayList<Student> data = new ArrayList<>();
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Amit";
		Student st2 = new Student();
		st2.rollNum = 22;
		st2.name = "Sumit";
		
		data.add(st2);
		data.add(st1);
		data.add(new Student());
        Student ab = data.get(0);
	  ab.displayStudentInfo();
	  
	  data.get(1).displayStudentInfo();
	  
	
	  
	  
	  for(Student each: data)
	  {
		  System.out.println(each.rollNum);
		  System.out.println(each.name);
		  each.displayStudentInfo();
	  }
	  
	}

}
