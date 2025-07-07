package wipro;
import java.util.*;
public class project11 
{
	public static void main(String[] args) 
	{
		Scanner aa = new Scanner(System.in);
		char abc =aa.nextLine().charAt(0);
		
		if((abc>='A'&&abc<='Z')||(abc>='a'&&abc<='z'))
			System.out.println("Alphabets");
		else if((abc>='0')&&(abc<='9'))
			System.out.println("Digetal");
		else
			System.out.println("Special Charactor");

	}

}
