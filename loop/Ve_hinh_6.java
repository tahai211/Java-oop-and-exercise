package loop;

import java.util.Scanner;

public class Ve_hinh_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            for (int y = 1; y <= m; y++) {
                if (y % 2 == 0) {
                    for (int z = 1; z <= n; z++) {
                    	if (z % 2 == 0) {

                        System.out.print("*");
                    	}else {
                    		System.out.print(".");
                    	}
                    }
                } else {
                    for (int j = 1; j <= n; j++) {
                        if (j % 2== 0) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.printf("\n");

            }
            System.out.println("");
        }


	}

}
