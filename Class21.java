package wipro;

import java.util.*;

public class Class21
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int num=n;
	  int rev=0;
	   while(n>0)
	   {
		 int  ld = n%10;
		  rev = rev*10 +ld;
		  n=n/10;
		  
	   }
	  // System.out.println(rev);
	   if(num==rev)
	   {
		   System.out.println("Its an palogram");
	   }
	   else
		   System.out.println("Its not");
		
	}
}
