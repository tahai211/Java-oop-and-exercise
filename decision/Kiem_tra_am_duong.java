package decision;

import java.util.Scanner;

public class Kiem_tra_am_duong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		if(a<0) {
			System.out.printf("%.03f la so am ",a);
		}else {
			System.out.printf("%.03f la so duong ",a);
		}

	}

}
