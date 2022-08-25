package SCS;

import java.util.Scanner;

public class Trò_chơi_Pacman_remix {
	//Trai - Len - Phai - Xuong
	// 0			1			2			3
	static int m,n;
	static int [] []matrix;
	static String pacman,ghost;
	static int dir_pacman,dir_ghost;
	static int point_pacman,point_ghost;
	private static void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		matrix = new int [n][n];
		for(int i = 0 ; i< n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		pacman = sc.nextLine();
		ghost = sc.nextLine();
	}
	static int []dx = {0, -1 ,0, 1};
	static int []dy = {-1, 0 , 1 ,0};
	private static void solve() {
		point_ghost = 0;
		point_pacman = 0;
		dir_pacman = 3;
		dir_ghost = 1;
		int tx_pacman,ty_pacman;
		int tx_ghost,ty_ghost;
		tx_pacman = 1;
		ty_pacman=1;
		tx_ghost= n-1;
		ty_ghost = n-1;
		for (int i = 0 ; i< m ; i++) {
			//PACMAN
			if(pacman.charAt(i) == 'C') {
				tx_pacman += dx[dir_pacman];
				ty_pacman += dy[dir_pacman];
			}
			else if(pacman.charAt(i) == 'L') {
				dir_pacman = turn_left(dir_pacman);
				tx_pacman += dx[dir_pacman];
				ty_pacman += dy[dir_pacman];
			}
			else if(pacman.charAt(i) == 'R') {
				dir_pacman = turn_right(dir_pacman);
				tx_pacman += dx[dir_pacman];
				ty_pacman += dy[dir_pacman];
			}
			//GHOST
			if(ghost.charAt(i) == 'C') {
				tx_ghost += dx[dir_ghost];
				ty_ghost += dy[dir_ghost];
			}
			else if(pacman.charAt(i) == 'L') {
				dir_ghost = turn_left(dir_ghost);
				tx_ghost += dx[dir_ghost];
				ty_ghost += dy[dir_ghost];
			}
			else if(pacman.charAt(i) == 'L') {
				dir_ghost = turn_right(dir_ghost);
				tx_ghost += dx[dir_ghost];
				ty_ghost += dy[dir_ghost];
			}
			if(tx_pacman == tx_ghost &&ty_pacman== ty_ghost) {
				break;
			}else {
				point_pacman += matrix[tx_pacman][ty_pacman];
				matrix[tx_pacman][ty_pacman] = 0;
				
				point_ghost += matrix[tx_ghost][ty_ghost];
				matrix[tx_ghost][ty_ghost] = 0;
			}
		}
	}
	private static int turn_left(int x) {
		return (x+3)%4;
	}
	private static int turn_right(int x) {
		return (x+1)%4;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc .nextInt();
		for(int i = 1 ; i <= t ; i++) {
			input();
			solve();
			System.out.println("# "+i+" "+point_pacman+" "+point_ghost);
		}

	}

}
