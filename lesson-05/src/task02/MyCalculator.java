package task02;

public class MyCalculator implements Numerable {

	@Override
	public double add(double a, double b) {

		return a + b;
	}

	@Override
	public double subtract(double a, double b) {

		return a - b;
	}

	@Override
	public double multiply(double a, double b) {

		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		if (b != 0) {
			return a / b;
		} else {
			System.out.println("You can`t divide to 0 and b can`t be 0");
			return 0;
		}

	}

}