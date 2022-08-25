package decision;

import java.util.Scanner;

public class Kiem_tra_3_canh_cua_tam_giac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.printf("%.2f, %.2f, %.2f co the la 3 canh cua tam giac", a, b, c);
		}

		else {
			System.out.printf("%.2f, %.2f, %.2f khong the la 3 canh cua tam giac", a, b, c);
		}

	}

}
