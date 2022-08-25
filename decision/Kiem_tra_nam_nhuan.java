package decision;

import java.util.Scanner;

public class Kiem_tra_nam_nhuan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	
		 if(x%4==0)
		   {
		       if(x%100==0)
		       {
		           if(x%400==0)
		           {
		               System.out.printf("Nam %u la nam nhuan",x);
		           }
		           else
		           {
		        	   System.out.printf("Nam %u khong phai la nam nhuan",x);
		           }
		       }
		       else
		       {
		    	   System.out.printf("Nam %u la nam nhuan",x);
		       }
		   }
		   else
		   {
			   System.out.printf("Nam %u khong phai la nam nhuan",x);
		   }

	}

}
