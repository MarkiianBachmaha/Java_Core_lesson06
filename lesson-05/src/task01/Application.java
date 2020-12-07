package task01;

public class Application {

	public static void main(String[] args) {

		HourWorker hourworker = new HourWorker("Paul", 24.7, 160);
		FixedWorker fixedworker = new FixedWorker("William", 4);

		hourworker.calculateSalary();
		System.out.println(hourworker.getName() + hourworker.getSalary());

		fixedworker.calculateSalary();
		System.out.println(fixedworker.getName() + fixedworker.getSalary());

	}

}