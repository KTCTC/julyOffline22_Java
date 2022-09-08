package collection;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {

Stack<Integer> data = new Stack<>();
data.push(34);
data.push(22);
data.push(777);
System.out.println(data.get(2));
int ab = data.pop();
System.out.println(ab);

System.out.println(data);

	}

}
