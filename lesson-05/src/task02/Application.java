package task02;

public class Application {

	public static void main(String[] args) {

		double a = 7.35;
		double b = 2.81;

		MyCalculator calculator = new MyCalculator();

		System.out.println("The result of the addition a and b is: " + calculator.add(a, b));
		System.out.println("The result of subtraction a and b is: " + calculator.subtract(a, b));
		System.out.println("The result of multiplication a and b is: " + calculator.multiply(a, b));
		System.out.println("The result of the division a and b is: " + calculator.divide(a, b));

	}

}