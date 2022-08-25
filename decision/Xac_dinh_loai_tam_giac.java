package decision;

import java.util.Scanner;

public class Xac_dinh_loai_tam_giac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.printf("(%.5f, %.5f, %.5f) la tam giac vuong", a, b, c);
		}else if ((a == b) && (b == c) && (c == a)) {
			System.out.printf("(%.5f, %.5f, %.5f) la tam giac deu", a, b, c);
		}else if ((a == b) || (b == c) || (c == a)) {
			System.out.printf("(%.5f, %.5f, %.5f) la tam giac can", a, b, c);
		}else if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.printf("(%.5f, %.5f, %.5f) la tam giac thuong", a, b, c);
		}

	}

}
