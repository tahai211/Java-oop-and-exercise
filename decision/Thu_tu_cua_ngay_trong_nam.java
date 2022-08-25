package decision;

import java.util.Scanner;

public class Thu_tu_cua_ngay_trong_nam {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	         int a,b,c;
	         a=sc.nextInt();
	         b=sc.nextInt();
	         c=sc.nextInt();
	         switch (b){
	            case 1:
	                System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a,c);
	                break;
	            case 2:
	                System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+31,c);
	                break;
	            case 3:
	                if ((c % 4 == 0 && c % 100 != 0)||(c%400==0))
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+60,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+59,c);}
	                break;
	            case 4:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+91,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+91,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+90,c);}
	                break;
	            case 5:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+121,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+121,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+120,c);}
	                break;
	            case 6:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+152,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+152,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+151,c);}
	                break;
	            case 7:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+182,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+182,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+181,c);}
	                break;
	            case 8:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+213,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+213,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+212,c);}
	                break;
	            case 9:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+244,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+244,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+243,c);}
	                break;
	            case 10:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+274,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+274,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+273,c);}
	                break;
	            case 11:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+305,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+305,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+304,c);}
	                break;
	            case 12:
	                if (c % 4 == 0 && c % 100 != 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+335,c);}
	                else if  (c % 400 == 0)
	                {System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+335,c);}
	                else {
	                    System.out.printf("Ngay %d/%d la ngay thu %d cua nam %d",a,b,a+334,c);}
	                break;
	                }

	}

}
