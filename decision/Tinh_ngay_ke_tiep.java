package decision;

import java.util.Scanner;

public class Tinh_ngay_ke_tiep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		switch(m) {
		case 1,3,5,7,8,10,12:
			if (d==31) {
				
			}
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ) {
				
			}
		}

	}

}
