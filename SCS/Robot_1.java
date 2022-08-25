package SCS;

import java.util.Scanner;

public class Robot_1 {
	static int n,dem;
	static int[][]x;
	 static void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = new int[n][2];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 2; j++) {
				x[i][j] = sc.nextInt();
			}
		}
	}
	 /*public static int turn_right(int a) {
		 return(a+1)%4;
	 }
	 public static int huongBd(int xt,int yt,int xs,int ys) {
		 int dx[] = {0 , -1 ,0 , 1};
		 int dy[] = {0 , -1 ,0 , 1};
		 int a = xt-xs;
		 int b = yt-ys;
		 for(int i = 0 ; i< 4 ; i++) {
			 if(a==dx[i]&& b == dy[i]) {
				 return i;
			 }
		 }
		 return -1; 
		 
	 }*/
	private static void solve() {
		 dem = 0;
		// int dx[] = {0 , -1 ,0 , 1};
		// int dy[] = {0 , -1 ,0 , 1};
		 //int dir = huongBd(x[1][0],x[1][1],x[0][0],x[0][1]);
		 //int a= x[1][0];
		// int b = x[1][1];
		for(int i = 1 ; i < n ; i++) {
			/*int dir_t = huongBd(x[i][0],x[i][1],x[i-1][0],x[i-1][1]);
			dir = turn_right(dir);
				if(dir == dir_t) {
					dem++;
				}
				dir = dir_t;*/
				if(x[i][1]==x[i-1][1]) {
					dem++;
				}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0 ; i < t ; i++) {
			
			input();
			solve();
			System.out.printf("# %d: %d",i+1,dem);
		}

	}

}
