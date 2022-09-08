package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {

  Set<Integer> data = new LinkedHashSet<>();
  Integer a = new Integer(23);
	Integer b = new Integer(10);
	data.add(null);
	data.add(a);
	data.add(new Integer(230));
	data.add(b);
	data.add(a);
	data.add(new Integer(555));
	data.add(null);
	
	data.remove(a);
	
	System.out.println(data);
	System.out.println(data.size());
	int i=0;
	for (Integer each : data)
	{
		if (i==3)
		{
			System.out.println(each);
			break;
		}
		
		i++;
		
	}
	
  

	}

}
