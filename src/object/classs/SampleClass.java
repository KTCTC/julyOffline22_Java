package object.classs;

public class SampleClass {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.rollNumber =1;
		obj.name ="Amit";
		obj.devision = 'B';
		System.out.println(obj.devision);
		
		obj.studentPlaysSport();
		obj.studentStudies();

	}

}
