package decision;

import java.util.Scanner;

public class Song_xa_dai_chien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x, y;
        int a, b;
        x = sc.nextInt();
        y = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        if (x == a) {
             System.out.printf("Xe1 (%d,%d) va Xe2 (%d,%d) co the an nhau",x,y,a,b);
        }else if (y==b && x!=a) {
        	System.out.printf("Xe1 (%d,%d) va Xe2 (%d,%d) co the an nhau",x,y,a,b);
        }else {
        	System.out.printf("Xe1 (%d,%d) va Xe2 (%d,%d) khong the an nhau",x,y,a,b);
        }

	}

}
