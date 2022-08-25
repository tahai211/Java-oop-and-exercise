package decision;

import java.util.Scanner;

public class Kiem_tra_tinh_hop_le_cua_ngay_thang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		if(d>0&&m>0&&y>0)
	    {
	        if(0<m && m<=12)
	        {
	            if(m==2)
	            {
	                if(y%4==0)
	                {
	                    if(y%100==0)
	                    {
	                        if(y%400==0)
	                        {

	                            if(d<=29)
	                            {
	                            	System.out.printf("%d/%d/%d: hop le",d,m,y);
	                            }
	                            else
	                            {
	                            	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	                            }
	                        }
	                        else
	                        {
	                            if(d<=28)
	                            {
	                            	System.out.printf("%d/%d/%d: hop le",d,m,y);
	                            }
	                            else
	                            {
	                            	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	                            }
	                        }
	                    }
	                    else
	                    {
	                        if(d<=28)
	                        {
	                        	System.out.printf("%d/%d/%d: hop le",d,m,y);
	                        }
	                        else
	                        {
	                        	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	                        }
	                    }
	                }
	                else
	                {
	                    if(d<=28)
	                    {
	                    	System.out.printf("%d/%d/%d: hop le",d,m,y);
	                    }
	                    else
	                    {
	                    	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	                    }
	                }
	            }
	            else if (m==4 || m==6 || m==9 || m==11)
	            {
	                if(d<=30)
	                {
	                	System.out.printf("%d/%d/%d: hop le",d,m,y);
	                }
	                else
	                {
	                	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	                }
	            }
	            else
	            {
	                if (d<=31)
	                {
	                	System.out.printf("%d/%d/%d: hop le",d,m,y);
	                }
	                else
	                {
	                	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	                }
	            }
	        }
	        else
	        {
	        	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	        }
	    }
	    else
	    {
	    	System.out.printf("%d/%d/%d: khong hop le",d,m,y);
	    }

	}

}
