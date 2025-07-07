package wipro;

public class Class19 {

	public static void main(String[]args) 
	{	
		for(int n=10;n<=99;n++) {
		int co=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				co++;
			}
		}
        if(co==2)
			{
				System.out.println(n);
			}	
		}
	}
}
