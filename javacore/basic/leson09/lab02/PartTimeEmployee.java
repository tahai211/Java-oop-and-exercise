package javacore.basic.leson09.lab02;

public class PartTimeEmployee extends Employee{
	private int workingHours;

	public PartTimeEmployee(String name, int paymentPerHour,int workingHours) {
		super(name,paymentPerHour);
		this.workingHours = workingHours;
	}

	public PartTimeEmployee() {
		super();
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary();
	}

}
