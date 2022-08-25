package SCS;

import java.util.Scanner;

public class Robot_2 {
	static int x,y,k,flagA,flagB;
	static String robotA,robotB;
	static int W =0;
	static int N = 1;
	static int E = 3;
	static int S = 4;
	static int [] dx = {-1 ,0,1,0};
	static int [] dy = {0 ,1,0,-1};
	static int ax,ay,dirA;
	static int bx,by,dirB;
	public static void input(Scanner sc) {
		x= sc.nextInt();
		y = sc.nextInt();
		k = sc.nextInt();
		robotA = sc.nextLine();
		robotB = sc.nextLine();
	}
	public static int turn_left(int dir) {
		return (dir + 3)%4;
	}
	public static int turn_right(int dir) {
		return (dir + 1)%4;
	}
	public static int turn_back(int dir) {
		return (dir + 2)%4;
	}
	public static void solve() {
		
		ax = 0;
		ay = 0 ; 
		dirA = N;
		bx = 0;
		by = 0;
		dirB = N;
		for (int i = 0 ; i < k ; i++) {
			//robot A
			switch(robotA.charAt(i)) {
			case 'W':
				dirA = W;
				ax--;
				break;
			case 'N':
				dirA = N;
				ay++;
				break;
			case 'E':
				dirA = E;
				ax++;
				break;
			case 'S':
				dirA = S;
				ay--;
				break;
			case 'L':
				dirA = turn_left(dirA);
				ax += dx[dirA];
				ay += dy[dirA];
				break;
			case 'R':
				dirA = turn_right(dirA);
				ax += dx[dirA];
				ay += dy[dirA];
				break;
			case 'B':
				dirA = turn_back(dirA);
				ax += dx[dirA];
				ay += dy[dirA];
				break;
			case 'c':
				ax += dx[dirA];
				ay += dy[dirA];
				break;
			}
			//robot B
			switch(robotB.charAt(i)) {
			case 'W':
				dirB = W;
				bx--;
				break;
			case 'N':
				dirB = N;
				by++;
				break;
			case 'E':
				dirB = E;
				bx++;
				break;
			case 'S':
				dirB = S;
				by--;
				break;
			case 'L':
				dirB = turn_left(dirB);
				bx += dx[dirB];
				by += dy[dirB];
				break;
			case 'R':
				dirB = turn_right(dirB);
				bx += dx[dirB];
				by += dy[dirB];
				break;
			case 'B':
				dirB = turn_back(dirB);
				bx += dx[dirB];
				by += dy[dirB];
				break;
			case 'c':
				bx += dx[dirB];
				by += dy[dirB];
				break;
			

				
			}
			if(ax==x&&ay==y) {
				flagA =1;
				
			}
			if(bx==x&&by==y) {
				flagB =1;
				
			}
		}
		
	}
	public static double  dirstance(int x1, int x2,int y1, int y2) {
		return Math.sqrt(x1 -x2)*(x1-x2) + (y1 - y2)*(y1 -y2);
		
	}
	public static void output(int tc) {
		System.out.printf("# %d ",tc);
		if(flagA == 1&& flagB == 1) {
			System.out.printf("Good game !");
		}else if (flagA == 1) {
			System.out.printf("Team A win !");
		}else if(flagB == 1) {
			System.out.printf("Team B win !");
		}else {
			System.out.printf("%.3f %.3f",dirstance(ax, ay, x, y),dirstance(bx, by, x, y));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1 ; i <= t ; i++) {
			input(sc);
			solve();
			output(t);
		}

	}

}
