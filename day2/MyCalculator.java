package week1.day2;

public class MyCalculator {

	public static void main (String args[]) {
		Calculator objCal = new Calculator();
		int sum = objCal.sumOfThreeNumbers(20, 40, 60);
		System.out.println("Sum of Three Numbers is " +sum);
		int sub = objCal.subOfTwoNumbers(20, 40);
		System.out.println("Subtraction of Two Numbers is " +sub);
		double product = objCal.productOfTwoNumbers(50.5, 50.5);
		System.out.println("The Product of Two Numbers is " +product);
		float division = objCal.divOfTwoNumbers(25.5f, 2.5f);
		System.out.println("The division of Two Numbers is " +division);

	}






}
