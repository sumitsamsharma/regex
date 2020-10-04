package regx;
import java.util.regex.*;
import java.util.Scanner;

public class Com 
{
	public static void main(String[] args)
	{
	    Scanner c=new Scanner(System.in);
	    System.out.println("Enter pincode");
	    String n=c.next();
		System.out.println(Pattern.matches("^[1-9]{6}",n));
		c.close();
	}   
}
