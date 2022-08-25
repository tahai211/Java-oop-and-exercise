package decision;

import java.util.Scanner;

public class Tinh_gia_tri_cua_ham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		if (x>=5) {
			System.out.printf("f(%f) = %f",x,2*x*x+5*x+9);
		}else {
			System.out.printf("f(%f) = %f",x,-2*x*x+4*x-9);
		}

	}

}
