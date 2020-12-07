package task01;

public class HourWorker implements Salary {

	private String name;
	private double hourSalary;
	private int hourPerMonth;
	private double salary;

	public HourWorker(String name, double hourSalary, int hourPerMonth) {
		super();
		this.name = name;
		this.hourSalary = hourSalary;
		this.hourPerMonth = hourPerMonth;
	}

	public HourWorker() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}

	public int getHourPerMonth() {
		return hourPerMonth;
	}

	public void setHourPerMonth(int hourPerMonth) {
		this.hourPerMonth = hourPerMonth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void calculateSalary() {
		this.salary = this.hourSalary * this.hourPerMonth;
		System.out.println("Salary of " + this.name + " is: " + this.salary + " $");

	}

}