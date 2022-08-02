package object.classs;

public class CarClass {
	String brandName;
	String carType;
	int carPrice;

	public static void main(String[] args) {
		
		CarClass obj = new CarClass();
		CarClass obj1 = new CarClass();
		CarClass oo = obj;
		obj.brandName = "TATA";
		obj.carType = "SUV";
		obj.carPrice = 12;
		
		obj.CarHasPrice();
		obj1.CarHasPrice();
		oo.CarHasPrice();

	}

	public void CarHasPrice()
	{
		System.out.println("Car price is = "+carPrice);
	}
	
}
