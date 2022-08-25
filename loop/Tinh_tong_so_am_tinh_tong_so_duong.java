package loop;

import java.util.Scanner;

public class Tinh_tong_so_am_tinh_tong_so_duong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int a = 1;
		for (int i = 1; i <= n; i++) {
			while (a != 0) {
				a = sc.nextInt();
				if (a > 0) {
					sum1 += a;
				} else {
					sum2 += a;
				}
			}
			a =1;
			System.out.printf("NegativeSum = %d\t",sum2);
			System.out.printf("PositiveSum = %d\n",sum1);
			sum1 =0;
			sum2 =0;
			
		}
		

	}

}
