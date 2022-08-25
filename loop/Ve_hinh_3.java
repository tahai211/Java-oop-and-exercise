package loop;

import java.util.Scanner;

public class Ve_hinh_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int m;
            m = sc.nextInt();
            for (int y = 0; y < m; y++) {
                if (y == 0 || y == m - 1) {
                    for (int z = 0; z < m; z++) {

                        System.out.print("*");
                    }
                } else {
                    for (int j = 0; j < m; j++) {
                        if (j == 0 || j == m - 1||j == y) {
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
