package loop;

import java.util.Scanner;

public class Tinh_tong_cua_day_so_thuc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum =0;
		double a=1;
		while (a!=0) {
			a = sc.nextDouble();
			sum = sum+a;
		}
		System.out.println(sum);

	}

}
