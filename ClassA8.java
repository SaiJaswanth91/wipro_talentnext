package project8;
import java.util.*;
public class ClassA8 
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				
			System.out.print("*");
			
			System.out.println();

		}
	}
	public static void main(String args[])
	{
		new ClassA8().meth1();
	}
     
}
