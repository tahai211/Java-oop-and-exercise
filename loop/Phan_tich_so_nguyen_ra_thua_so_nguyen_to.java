package loop;

import java.util.Scanner;

public class Phan_tich_so_nguyen_ra_thua_so_nguyen_to {
	static void phanTichThuaSoNguyenTo(int n) {

		int i = 2;
		System.out.printf("\n%d =", n);
		while (n > 1) {
			if (n % i == 0) {
				System.out.printf("%d ", i);
				n = n / i;
			} else {
				i++;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			int n = sc.nextInt();
			phanTichThuaSoNguyenTo(n);
			System.out.printf("\n ");
		}

	}

}
