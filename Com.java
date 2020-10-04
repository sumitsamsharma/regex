package regx;
import java.util.regex.*;
import java.util.Scanner;

public class Com 
{
	public static void main(String[] args)
	{
	    Scanner c=new Scanner(System.in);
	    System.out.println("Enter pincode");
	    String n=c.nextLine();
	    System.out.println("String is"+n);
		System.out.println(Pattern.matches("^[1-9]{1}[0-9]{2}\s{0,1}[0-9]{3}$",n));
		c.close();
	}   
}