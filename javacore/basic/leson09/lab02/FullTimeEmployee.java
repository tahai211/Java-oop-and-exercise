package javacore.basic.leson09.lab02;

public class FullTimeEmployee extends Employee{
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name,paymentPerHour);
	}
	public FullTimeEmployee() {
	}
	@Override
	public int calculateSalary() {
		
		return super.calculateSalary();
	}
}
