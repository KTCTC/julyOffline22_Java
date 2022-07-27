package object.classs;

public class HumanBeing {
float height;
String name = "KTCTC";
float weight;
int age;
	public static void main(String[] args) {

HumanBeing obj = new HumanBeing();
HumanBeing obj1 = new HumanBeing();
	obj.name = "Ganesh";
	obj.height = 5.3f;
	obj.age = 31;
	obj.weight = 80.3f;
	
	System.out.println(obj1.name);
	System.out.println(obj1.age);
	System.out.println(obj.name);
	System.out.println(obj.weight);
	obj.humanCanEat();
	obj1.humanCanTalk();

	}
	
	public void humanCanTalk()
	{
		System.out.println("Human being can talk In English Language");
	}
	
	public void humanCanEat()
	{
		System.out.println("Human being eat Roti or bread or Pizza");
	}

}
