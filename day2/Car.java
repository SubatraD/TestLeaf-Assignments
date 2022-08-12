package week1.day2;

public class Car {

	public void myCarBrand () {
		System.out.println("Volkswagen");
	}
	public String getCarColor () {
		return "Silver";
	}
	public int getCarEngineNo () {
		return 123456;
	}
	public int subOfTwoNumbers (int a, int b) {
		int c = a-b;
		return c;
	}
	public int productOfTwoNumbers (int a, int b) {
		int c = a*b;
		return c;
	}
	public int divOfTwoNumbers (int a, int b) {
		int c = a/b;
		return c;
	}
	public static void main (String[] args) {
		Car obj = new Car ();
		obj.myCarBrand();
		String output = obj.getCarColor();
		System.out.println(output);
		int engineNo = obj.getCarEngineNo();
		System.out.println(engineNo);
		int sub = obj.subOfTwoNumbers(4, 2);
		System.out.println(sub);
		int product = obj.productOfTwoNumbers(2, 5);
		System.out.println(product);
		int division = obj.divOfTwoNumbers(4, 2);
		System.out.println(division);

	}
}
