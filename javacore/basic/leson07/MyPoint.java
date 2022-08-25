package javacore.basic.leson07;

public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
public MyPoint() {
		
		this.x = 0;
		this.y = 0;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getDistance(double x1,double y1) {
		double kc = Math.sqrt(this.x - x1)*(this.x - x1)+(this.y - y1)*(this.y - y1);
		return kc;
	}
	@Override
	public String toString() {
		return " ( " + x + ", " + y + ")";
	}
	

}
