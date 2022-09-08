package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> data1 = new LinkedList<>();
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
		
		
		LinkedList<Integer> data = new LinkedList<>();
		
		
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
