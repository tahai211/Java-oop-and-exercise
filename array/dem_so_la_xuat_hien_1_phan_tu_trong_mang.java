package array;

import java.util.Scanner;

public class dem_so_la_xuat_hien_1_phan_tu_trong_mang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,sum;
		int n = sc.nextInt();
		int [] x = new int [n];
		for (int i = 0 ; i < n ; i++)
		{
			x[i] = sc .nextInt();
			
		}
		sum = 0;
		a = sc.nextInt();
		for (int j = 0 ; j < n ; j++)
		{
			if(a == x[j]) {
				sum++;
			}
			
		}
		System.out.println(sum);

	}

	}