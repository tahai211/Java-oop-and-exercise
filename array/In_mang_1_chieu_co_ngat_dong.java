package array;

import java.util.Scanner;

public class In_mang_1_chieu_co_ngat_dong {

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
		for (int j = 1 ; j <= n ; j++)
		{
			
			if(j%a == 0)
			{
				System.out.println(x[j]);
				System.out.println("\n");
			}else {
				System.out.println(x[j]);
			}
			
		}
		

	}

}
