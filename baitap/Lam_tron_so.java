package baitap;

import java.util.Scanner;

public class Lam_tron_so {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Su dung phuong thuc Math.round()");
        // lam tron len gom 1 so thap phan, nhan va chia cho 10
        System.out.println((double) Math.round(a * 10) / 10);
        // lam tron len gom 2 so thap phan, nhan va chia cho 100
        System.out.println((double) Math.round(a * 100) / 100);
        // lam tron len gom 3 so thap phan, nhan va chia cho 1000
        System.out.println((double) Math.round(a * 1000) / 1000);
 
        System.out.println("Su dung phuong thuc Math.ceil()");
        // lam tron len gom 1 so thap phan, nhan va chia cho 10
        System.out.println((double) Math.ceil(a * 10) / 10);
        // lam tron len gom 2 so thap phan, nhan va chia cho 100
        System.out.println((double) Math.ceil(a * 100) / 100);
        // lam tron len gom 3 so thap phan, nhan va chia cho 1000
        System.out.println((double) Math.ceil(a * 1000) / 1000);
	}

}
