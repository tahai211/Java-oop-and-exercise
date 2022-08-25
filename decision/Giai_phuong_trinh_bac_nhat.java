package decision;

import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {

	public static void main(String[] args) {
		//ax+b=0
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a==0) {
			System.out.printf("Vo nghiem");
		}else {
			double c = -b/a;
			System.out.printf("%.5f",c);
		}

	}

}
