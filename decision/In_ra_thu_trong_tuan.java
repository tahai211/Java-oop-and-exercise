package decision;

import java.util.Scanner;

public class In_ra_thu_trong_tuan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a) {
		case 2 :
			System.out.printf("Thu Hai");
			break;
		case 3 :
			System.out.printf("Thu Ba");
			break;
		case 4 :
			System.out.printf("Thu Tu");
			break;
		case 5 :
			System.out.printf("Thu Nam");
			break;
		case 6 :
			System.out.printf("Thu Sau");
			break;
		case 7 :
			System.out.printf("Thu Bay");
			break;
		case 8 :
			System.out.printf("Chu Nhat");
			break;
		default:
			System.out.printf("Khong Hop Le");
				
		}

	}

}
