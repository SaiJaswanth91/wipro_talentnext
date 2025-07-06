package project9;

import java.util.Scanner;

public class ClassA9
{
	void meth() {
		  Scanner ee=new Scanner(System.in);
	        int val=ee.nextInt();
	        int sup=0;
	        for(int i=1;i==val;i++)
	        {
	        	if(val%i==0)
	        	{
	        		sup++;
	        	}
	        }
	        	if(sup%2==0)
	        	{
	        		System.out.println("Its Prime");
	        	}
	        	else
	        		System.out.println("Its Not Prime");
		}

	public static void main(String[] args)
	{
       new ClassA9().meth();
	}
}
