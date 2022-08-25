package loop;

import java.util.Scanner;

public class Kiem_tra_so_chinh_phuong {

private static int find_square_number(int n){
   
    int flag = 0;
    int i = 0;
    while(i <= n){
        if( Math.pow( i, 2) == n ) {   
            flag = 1;
            break; 
        }
        i++;
    }

    return flag;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int j = 1; j <= x; j++) {
			int n = sc.nextInt();
			if(find_square_number(n)==1) {
				System.out.printf("\n%d : YES",n);
			}else {
				System.out.printf("\n%d : NO",n);
			}

		}
	}

}
