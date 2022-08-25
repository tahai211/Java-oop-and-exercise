package decision;

import java.util.Scanner;

public class Tim_so_lon_nhat_trong_3_so {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b) {
			if(b < c) {
				System.out.printf("max{%d, %d, %d} = %d",a,b,c,c);
			}else {
				System.out.printf("max{%d, %d, %d} = %d",a,b,c,b);
			}
		}else {
			if(a > c) {
				System.out.printf("max{%d, %d, %d} = %d",a,b,c,a);
			}else {
				System.out.printf("max{%d, %d, %d} = %d",a,b,c,c);
			}
		}

	}

}
