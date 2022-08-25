package loop;

import java.util.Scanner;

public class Ve_hinh_8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0 ; i < x ; i++) {
			int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
				for (int j =0 ; j<=3*m;j++) {
					for (int g = 0; g <= 3*n; g++) {
						if (j==0||j%3==0||g==0||g%3==0) {
						System.out.printf("*");
						}else {
							System.out.printf(".");
						}
						//if (i<n) {
							//in();
						//}
					}
					 System.out.printf("\n");
					
			}
		}
		

	}

}
