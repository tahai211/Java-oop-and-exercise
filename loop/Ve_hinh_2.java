package loop;

import java.util.Scanner;

public class Ve_hinh_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            for (int y = 0; y < m; y++) {
                if (y == 0 || y == m - 1) {
                    for (int z = 0; z < n; z++) {

                        System.out.print("*");
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        if (j == 0 || j == n - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.printf("\n");

            }
            System.out.println("");
        }

	}

}
