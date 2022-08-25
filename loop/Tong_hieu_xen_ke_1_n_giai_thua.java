package loop;

import java.util.Scanner;

public class Tong_hieu_xen_ke_1_n_giai_thua {
	public static final double tong(int n) {
		double s = 0;
		long p = 1;
			for (int i = 1; i <= n; i++)
			{
				if (i%2==0) {
				p = p * i;
				s = s - (double)1 / p;
				}else {
					p = p * i;
					s = s + (double)1 / p;
				}
			}
			return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(tong(n));

	}

}
