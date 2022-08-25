package array;

import java.util.Scanner;

public class Kiem_tra_su_ton_tai_mot_phan_tu_trong_mang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int n = sc.nextInt();
		int [] x = new int [n];
		for (int i = 0 ; i < n ; i++)
		{
			x[i] = sc .nextInt();
			
		}
		a = sc.nextInt();
		for (int j = 0 ; j < n ; j++)
		{
			if(a == x[j]) {
				System.out.println("yes");
				break;
			}
			
		}

	}

}
