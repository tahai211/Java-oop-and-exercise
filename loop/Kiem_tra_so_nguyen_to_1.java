package loop;

import java.util.Scanner;

public class Kiem_tra_so_nguyen_to_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int j = 1; j <= x; j++) {
			int n = sc.nextInt();
			if (n < 2) {
				System.out.printf("\n%d : NO", n);

			}
			int count = 0;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.printf("\n%d : YES", n);
			} else {
				System.out.printf("\n%d : NO", n);
			}
		}

	}

}
