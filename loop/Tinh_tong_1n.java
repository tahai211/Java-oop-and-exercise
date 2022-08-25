package loop;

import java.util.Scanner;

public class Tinh_tong_1n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for(int i=1 ;i <= n;i++) {
			sum=sum+(1.0/i);
		}
		System.out.println(sum);

	}

}
