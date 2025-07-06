package project10;
import java.util.*;
public class ClassA10 {

	void meth()
	{
		Scanner ss=new Scanner(System.in);
		char a=ss.next().charAt(0);
		
		char b=ss.next().charAt(0);
		
		if(a<b)
		{
			System.out.println(a+","+b);
		}
		else
			System.out.println(b+","+a);

		}
	public static void main(String[] args) {
	new ClassA10().meth();

}
	}
