package task01;

public class FixedWorker implements Salary {

	static int rate = 1000;
	private String name;
	private int salary;
	private int grade = 5;

	public FixedWorker(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public FixedWorker() {

	}

	public static int getRate() {
		return rate;
	}

	public static void setRate(int rate) {
		FixedWorker.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public void calculateSalary() {
		this.salary = this.rate *= grade;
		System.out.println("Salary of " + this.name + " is: " + this.salary + " $");
	}

}