package baitap;

import java.util.Scanner;

public class Kiem_tra_chia_het_ma_khong_so_sanh {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int result = a % b == 0 ? 1:0;
		System.out.println(result);
	}

}
