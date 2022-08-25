package baitap;

import java.util.Scanner;

public class Kiem_tra_chan_le_ma_khong_so_sanh {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int result = a % 2 == 0 ? 1:0;
		System.out.println(result);
		
	}

}
