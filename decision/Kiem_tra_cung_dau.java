package decision;

import java.util.Scanner;

public class Kiem_tra_cung_dau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a*b>0) {
			System.out.printf("Cung dau");
		}else {
			System.out.printf("Khac dau");
		}


	}

}
