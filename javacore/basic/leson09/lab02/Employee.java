package javacore.basic.leson09.lab02;

public class Employee implements IEmployee,IShow {
	private String name;
	private int paymentPerHour;
	

	public Employee() {
		super();
	}

	public Employee(String name, int paymentPerHour) {
		super();
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
