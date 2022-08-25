package decision;

import java.util.Scanner;

public class Phuong_trinh_bac_hai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double denta = b * b - 4 * a * c;
		if (a == 0) {
			System.out.printf("Phuong trinh co 1 nghiem don:\n");
			System.out.printf("x = %.5f", -c / b);
		} else {
			if (denta < 0) {
				System.out.printf("Phuong trinh vo nghiem");
			} else if (denta == 0) {
				System.out.printf("Phuong trinh co nghiem kep: x1 = x2 = %.5f", -b / (2 * a));
			} else {
				System.out.printf("Phuong trinh co 2 nghiem phan biet:\n");
				System.out.printf("x1 = %.5f\n", (-b + Math.sqrt(denta)) / (2 * a));
				System.out.printf("x2 = %.5f", (-b - Math.sqrt(denta)) / (2 * a));
			}
		}

	}

}
