package loop;

import java.util.Scanner;

public class Ve_hinh_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0 ; i < x ; i++) {
			int r,c,h,w;
            r = sc.nextInt();
            c = sc.nextInt();
            h = sc.nextInt();
            w = sc.nextInt();
            if (h%2==0) {
            	r=r*3;
            	h = 3;
            	
            }else {
            	r=r*2;
            	h = 2;
            }
            if (w%2==0) {
            	c=c*3;
            	w=3;
            	
            }else {
            	c=c*2;
            	w=2;
            }
				for (int j =0 ; j<=r;j++) {
					for (int g = 0; g <= c; g++) {
						
						if (j==0||j%h==0||g==0||g%w==0) {
						System.out.printf("*");
						}else {
							System.out.printf(".");
						}
						
					}
					 System.out.printf("\n");
					
			}
		}

	}

}
