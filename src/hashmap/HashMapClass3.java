package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

import collection.Student;

public class HashMapClass3 {

	public static void main(String[] args) {

		HashMap<Integer, Student> data = new HashMap<>();
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Amit";
		Student st2 = new Student();
		st2.rollNum = 22;
		st2.name = "Sumit";
		
		data.put(1, st2);
		data.put(2, st1);
		
		Student sss = data.get(2);
		System.out.println(sss.rollNum);
		
		
		for (Entry<Integer, Student> each:data.entrySet())
		{
			System.out.println(each.getKey());
			Student sty = each.getValue();
			sty.displayStudentInfo();
			//each.getValue().displayStudentInfo();
		}
		

	}

}
