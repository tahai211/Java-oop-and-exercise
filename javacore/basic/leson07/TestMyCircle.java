package javacore.basic.leson07;

public class TestMyCircle {

	public static void main(String[] args) {
		
		MyCircle c1 = new MyCircle(new MyPoint(2, 3), 5);
		
		MyCircle c2 = new MyCircle(new MyPoint(6, 6), 8);
		System.out.println(c1.getCircumference());
		System.out.println(c1.getArea());
		System.out.println(c2.getCircumference());
		System.out.println(c2.getArea());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
