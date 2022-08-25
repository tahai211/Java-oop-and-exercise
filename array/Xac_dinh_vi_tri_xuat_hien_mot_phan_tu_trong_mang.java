package array;

import java.util.Scanner;

public class Xac_dinh_vi_tri_xuat_hien_mot_phan_tu_trong_mang {
	static int check(int x[],int a)
	{
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			if (a == x[i]) {
				sum ++; 

			}

		}
		return sum;
	}
	static void vitri (int x[],int a)
	{
		for (int i = 0; i < x.length; i++) {
			if (a == x[i]) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();

		}
	
		a = sc.nextInt();
		int b = check(x,a);
		if(b==0 )
		{
			System.out.println("The value "+a+" does not exist in the given array");
		}else {
			System.out.println("The value "+a+" appears "+b+" time(s)\n");
			System.out.println("At the following position(s): ");
			vitri(x, a);
		}
		

	}

}
