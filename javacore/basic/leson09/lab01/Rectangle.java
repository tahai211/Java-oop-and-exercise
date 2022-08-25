package javacore.basic.leson09.lab01;

public class Rectangle implements IShape {
	private double lenght;
	private double width;
	public Rectangle() {
		
	}
	

	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}


	public double getLenght() {
		return lenght;
	}


	public void setLenght(double lenght) {
		this.lenght = lenght;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	
	public double getPerimeter() {
		
		return (lenght+width)*2;
	}

	
	public double getArea() {
		
		return lenght*width;
	}

	
	public void show() {
		System.out.println("Rectangle("+lenght+" , " +width+"): perimeter = "+getPerimeter()+", area = "+getArea());
		
	}

}
