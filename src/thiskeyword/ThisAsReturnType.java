package thiskeyword;

public class ThisAsReturnType {
	int rollNum;
	String name;

	public static void main(String[] args) {
		ThisAsReturnType obj = new ThisAsReturnType();

		ThisAsReturnType oo = obj.nonStatic();
		System.out.println(oo.rollNum);
	}

	public ThisAsReturnType nonStatic() {
		this.rollNum = 56;
		this.name = "KT";

		return this;

	}

}
