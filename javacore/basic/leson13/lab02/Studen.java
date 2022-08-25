package javacore.basic.leson13.lab02;

import java.time.LocalDate;

public class Studen {
	private int id;
	private String fristName;
	private String lastName;
	private LocalDate birthday;
	private double gpa;
	public Studen(int id, String fristName, String lastName, LocalDate birthday, double gpa) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.gpa = gpa;
	}
	public Studen() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Studen [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", birthday=" + birthday
				+ ", gpa=" + gpa + "]";
	}
	

}
