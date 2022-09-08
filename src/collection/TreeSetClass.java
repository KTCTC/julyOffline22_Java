package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

  TreeSet<Integer> data = new TreeSet<>();
  Integer a = new Integer(23);
	Integer b = new Integer(10);
	
	data.add(a);
	data.add(new Integer(230));
	data.add(b);
	data.add(a);
	data.add(new Integer(555));
	
	
	data.remove(a);
	
	System.out.println(data);
	System.out.println(data.size());
	for (Integer each : data)
	{
		System.out.println(each);
	}
	
  

	}

}
