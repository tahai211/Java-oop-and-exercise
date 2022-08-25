package array;

import java.util.Scanner;

public class Chon_loc_cac_phan_tu_cua_mang {

	static int n;
	static float[] x;

	private static void input() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		x = new float[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextFloat();
		}
	}

	private static float medium() {

		float md = 0;
		for (int i = 0; i < n; i++) {
			md += x[i];
		}
		md /= n;
		return md;

	}

	private static void bigger_md(float c) {

		for (int i = 0; i < n; i++) {
			if (x[i] > c) {
				System.out.println(x[i]);
			}
		}
	}

	public static void main(String[] args) {

		input();
		float c = medium();
		bigger_md(c);

	}

}
