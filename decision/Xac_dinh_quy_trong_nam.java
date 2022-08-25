package decision;

import java.util.Scanner;

public class Xac_dinh_quy_trong_nam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a) {
		case 1,2,3:
			System.out.printf("Thang %d thuoc quy I",a);
		break;
		case 4,5,6:
			System.out.printf("Thang %d thuoc quy II",a);
		break;
		case 7,8,9:
			System.out.printf("Thang %d thuoc quy III",a);
		break;
		case 10,11,12:
			System.out.printf("Thang %d thuoc quy IV",a);
		break;
		}

	}

}
