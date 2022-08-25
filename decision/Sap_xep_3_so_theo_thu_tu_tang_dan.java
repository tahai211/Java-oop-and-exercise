package decision;

import java.util.Scanner;

public class Sap_xep_3_so_theo_thu_tu_tang_dan {

	public static void main(String[] args) {
		double  d;
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a > b) {
			 d = a;
	         a = b;
	         b = d;
	    }
	    if (a > c) {
	         d = a;
	         a = c;
	         c = d;
	    }
	    if (b > c) {
	         d = b;
	         b = c;
	         c = d;
	    }
	    System.out.printf("%.2f --> %.2f --> %.2f",a,b,c);
			
					

	}

}
