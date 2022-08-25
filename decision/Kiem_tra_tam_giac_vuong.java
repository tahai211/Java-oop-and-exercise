package decision;

import java.util.Scanner;

public class Kiem_tra_tam_giac_vuong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if((a+b>c) && (a+c>b) && (b+c>a))
	    {
	        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a))
	        {
	            System.out.printf("Co");
	        }
	        else
	        {
	        	 System.out.printf("Khong");
	        }
	    } else {
	    	 System.out.printf("Khong");
	    }

	}

}
