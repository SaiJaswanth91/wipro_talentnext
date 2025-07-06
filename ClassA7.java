package project7;
import java.util.*;
public class ClassA7
{
	void meth() {
		 Scanner q=new Scanner(System.in);
	        
	        String g =q.nextLine();
	        int age=q.nextInt();
	        if((g.equals("Female"))&&(age>=1&&age<=58))
	        		{
	        	       System.out.println("The percentage of intrest is 8.2%");
	        		}
	        if((g.equals("Female"))&&(age>=59&&age<=100))
	        	
	        	System.out.println("The percentage os intrest is 9.2%");
	        
	        if((g.equals("Male"))&&(age>=1&&age<=58))
	        	System.out.println("The percentage of intrest is 8.4%");
	        
	        if((g.equals("Male"))&&(age>=59&&age<=100))
	        	System.err.println("The percentage of intrest is 10.5%");
		
	}

	public static void main(String[] args) 
	{
       new ClassA7().meth();
	}

}
