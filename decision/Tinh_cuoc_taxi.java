package decision;

import java.util.Scanner;

public class Tinh_cuoc_taxi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		if (s<0.8) {
			System.out.printf("%f",10000);
		}else if (s <= 30.8) {
			System.out.printf("%f",10000+(s-0.8)*11000);
		}else {
			System.out.printf("%f",10000+(s-30.8)*10000+30*11000);
		}

	}

}
