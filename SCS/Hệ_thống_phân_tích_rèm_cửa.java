package SCS;

import java.util.Scanner;

public class Hệ_thống_phân_tích_rèm_cửa {
	//################

	//#****#****#****#

	//#****#****#****#

	//#****#....#****#

	//#....#....#****#

	//################

	//#....#****#****#

	//#....#****#....#

	//#....#....#....#

	//#....#....#....#

	//################
	//có 5 loại dèm cửa tương ứng với loại 0 , 1 ,2 ,3,4 việc in ra kết quả là đếm tất cả cửa số kia xem các loại dèm xuất hiện mấy lần 
	static int m;
	static int n;
	static char[][]x;
	private static void input() {
		Scanner sc = new  Scanner(System.in);
		x = new char[m][n];
		for(int i = 0 ; i < 5*m+1 ; i++) {
			for(int j = 0 ; j < 5*n+1 ; j++) {
				if(i==0||j==0||i%5==0||j%5==0) {
					x[i][j] = '#';
				}else {
					x[i][j] = sc.next().charAt(0);
				}
				
			}
			
		}
	}
	private static void solve(int t) {
		int dem;
		int []d = new int [5];//tạo 1 mảng 5 phần tử tương ứng với 5 loại rèm là 0,1,2,3,4
		for(int i = 1 ; i < 5*m+1 ; i+=5) {
			dem = 0;
			for(int j = 1 ; j < 5*n+1 ; j+=5) {
				
					for(int k = 0; k <=4;k++) {
						if (x[i+k][j]=='*') {
							dem++;//đếm được mấy dấu * thì là loại rèm đấy 
						}
						
						
					
				}
				
			}
			d[dem]++;//tìm đươcj loại nào thì loại ý cho value +1 lên 
			
		}
		System.out.printf("#%d ",t);
		for(int r = 0 ; r < 5; r++) {
			System.out.printf("%d ",d[r]);
		}
		System.out.printf("\n");
	}
	 
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1 ; i <= t ; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			
		}

	}

}
