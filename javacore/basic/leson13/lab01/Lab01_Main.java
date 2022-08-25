package javacore.basic.leson13.lab01;

import java.util.LinkedList;
import java.util.Scanner;

public class Lab01_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		int n = sc.nextInt();
		int number,X,Y,dem;
		String[] arr = new String[n];
		String[] b;
		String kitu;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
			b = arr[i].split(" ");
			number = Integer.parseInt(b[0]);
			switch (number) {
			case 1:
				kitu = b[1];
				switch (kitu) {
				case "F":
					X = Integer.parseInt(b[2]);
					list.add(0,X);
					break;
				case "L":
					X = Integer.parseInt(b[2]);
					list.add(X);
					break;
				case "P":
					Y = Integer.parseInt(b[2]);
					X = Integer.parseInt(b[3]);
					if(Y < list.size()) {
						list.add(0,X);
					}else {
						list.add(X);
					}
					
					break;
				}
			case 2:
				X = Integer.parseInt(b[1]);
				dem  =0;
				for(int j = list.size()-1; j >= 0; j--) {
					if(list.get(j) == X) {
						list.remove(j);
						dem++;
					}
				}
				System.out.println(dem);
				break;
			case 3:
				dem =0 ;
				X = Integer.parseInt(b[1]);
				Y = Integer.parseInt(b[2]);
				if(Y < list.size()) {
					for(int j = X ; j <= Y; j++) {
						System.out.printf("%d ",list.get(j));
					}
				}else {
					for(int j = X ; j < list.size(); j++) {
						System.out.printf("%d ",list.get(j));
					}
				}
				break;
			case 5:
				for(int j = 0 ; j < list.size(); j++) {
					System.out.printf("%d ",list.get(j));
				}
				break;
			}
		}

	}

}
