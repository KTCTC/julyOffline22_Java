package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stu	
		ArrayList<Integer> data1 = new ArrayList<>();
		Integer a = new Integer(23);
		Integer b = new Integer(10);
		
		data1.add(a);
		data1.add(b);
		data1.add(new Integer(8));
		data1.add(888);
		data1.add(a);
		data1.add(b);
		//data1.add(null);
		//data1.add(null);
		Collections.sort(data1);
		
		
		ArrayList<Integer> data = new ArrayList<>();
		
		
		data.add(a);
		data.add(b);
		data.add(new Integer(8));
		data.add(888);
		data.add(a);
		data.add(b);
		data.add(null);
		data.add(null);
		
		boolean fl = data.equals(data1);
		System.out.println(fl);
		
		System.out.println(data.size());
		
		data.remove(2);
		data.remove(b);
		System.out.println(data.size());
		Integer ab = data.get(2);
		System.out.println(ab);
		System.out.println(data);

	}

}
