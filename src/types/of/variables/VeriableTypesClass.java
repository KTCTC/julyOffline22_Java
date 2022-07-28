package types.of.variables;

public class VeriableTypesClass {
	
	int rollNumner;
	static int stVari;

	public static void main(String[] args) {
		int a = 90;
		VeriableTypesClass obj = new VeriableTypesClass();
		VeriableTypesClass obj1 = new VeriableTypesClass();
		obj.rollNumner = 89;
		obj1.rollNumner = 77;
		obj.stVari = 55;
		
		System.out.println(obj.rollNumner);
		System.out.println(obj.stVari);
		System.out.println(VeriableTypesClass.stVari);
		VeriableTypesClass.stVari = 778;
		System.out.println(obj1.stVari);
		System.out.println(VeriableTypesClass.a);
		System.out.println(obj.a);

	}

}
