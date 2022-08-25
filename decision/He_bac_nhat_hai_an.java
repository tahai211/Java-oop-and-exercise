package decision;

import java.util.Scanner;

public class He_bac_nhat_hai_an {

	public static void main(String[] args) {
		double d,d1,d2;
		Scanner sc = new Scanner(System.in);
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double c2 = sc.nextDouble();
		d = a1*b2-a2*b1;
		d1 = c1*b2-c2*b1;
		d2 = a1*c2-a2*c1;
		if(d!= 0) {
			System.out.printf("He phuong trinh co nghiem duy nhat\n");
			System.out.printf("x = %.5f\n",d1/d);
			System.out.printf("y = %.5f",d2/d);
		}else if (d == 0 & d1!= 0|d2 != 0) {
			System.out.printf("He phuong trinh vo nghiem");
		}else {
			System.out.printf("He phuong trinh co vo so nghiem");
		}

	}

}
