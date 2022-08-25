package loop;

import java.util.Scanner;

public class Boi_chung_nho_nhat {
	static int gcd(int a, int b) {

		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b; 
			} else {
				b -= a;
			}
		}
		return a; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.printf("LCM(    %d,    %d) =     %d", a, b, a*b/gcd(a,b));
		}
	}

}
