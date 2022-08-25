package loop;

import java.util.Scanner;

public class Tong_hieu_xen_ke_1_n {
	public static final double tong(int n) {
		double s = 0;
		for(int i =1;i <= n ; i++) {
			if (i%2==0) {
				s = s-(1.0)/i;
			}else {
				s = s+(1.0)/i;
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
