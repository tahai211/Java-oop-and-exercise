package javacore.basic.leson09.lab01;

public class Circle implements IShape{
	private double radius;
	

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getPerimeter() {
	
		return 2*radius*Math.PI;
	}

	
	public double getArea() {
		
		return Math.PI*radius;
	}


	public void show() {
		System.out.println("Circle(r = "+radius+"): perimeter = "+getPerimeter()+", area = "+getArea());
		
	}
	

}
