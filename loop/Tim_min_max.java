package loop;

import java.util.Scanner;

public class Tim_min_max {
	static void minmax(int a) {
		Scanner sc = new Scanner(System.in);
		double min = 0;
		double max = 0;
		for (int i = 1; i <= a; i++) {
			
			double b = sc.nextDouble();
			if(i==1) {
				min =b;
			}

			if (b < min) {

				min = b;
			}
			if(a==1) {
				max = b;
			}
			else if (b > max) {

				max = b;
			}
		}
		System.out.printf("min = %f max = %f",min,max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			minmax(a);
		}

	}

}
