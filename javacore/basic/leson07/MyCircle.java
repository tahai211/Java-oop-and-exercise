package javacore.basic.leson07;

public class MyCircle {
	private MyPoint tam;
	private double r;
	public MyCircle() {
		
		this.tam = new MyPoint(0,0);
		this.r = 0;
	}
	public MyCircle(double x ,double y, double r) {
		
		this.tam.setX(x);
		this.tam.setY(y);
		this.r = r;
	}
	public MyCircle(MyPoint tam, double r) {
		this.tam = tam;
		this.r = r;
	}
	public MyPoint getTam() {
		return tam;
	}
	public void setTam(MyPoint tam) {
		this.tam = tam;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getCircumference() {
		return 2*r*3.14;
	}
	public double getArea() {
		return 3.14*r*r;
	}
	@Override
	public String toString() {
		return "Circle into: " + tam + ", radius =" + r + ",circumference = "+getCircumference()+",area = "+getArea();
	}
	
	
}
