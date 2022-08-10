package array;

import java.util.Arrays;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysInJava obj = new ArraysInJava();
		int a = 34;
		
		int[] b = {23,34,56,78,34}; 
		
		int[] arr = {23,34,56,78,34};
		int abcd[] = {34,4,5667,44,2,1};
		
	int lng = 	abcd.length;
		System.out.println(lng);
		Arrays.sort(abcd);;
		
		boolean fl = Arrays.equals(b, arr);
		
		System.out.println(fl);
		boolean flag = b==arr;
		System.out.println(flag);
		
		b[4] =555;
		
		int d = b[2];
		System.out.println(d);
		b[3] = 2;
		
		
		System.out.println(b);
		System.out.println(obj);

	}

}
