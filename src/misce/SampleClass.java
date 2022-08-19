package misce;

import java.io.PrintStream;

public class SampleClass {
int a=9;
static int b = 78;
Student st1 = new Student();
static Student st2 = new Student();

static PrintStream oo = new PrintStream(System.out);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleClass obj = new SampleClass();
		obj.a = 67;
		obj.st1.rollNum = 78;
		obj.st1.sampleMethodFromStudent();
		
		SampleClass.b = 90;
		oo.println("ABCBFJBEKFBFKEJB");
		SampleClass.st2.sampleMethodFromStudent();
		System.out.println("Sample print");
		SampleClass.oo.println("Sample print method without system class");

	}

}
