
//3. WAP to find the factorial of a number?
package A2;
import java.util.Scanner;
public class Assign3 
{
	public static void main(String[] args)
	{
		int num;
		System.out.println("enter number:");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		int i,fact = 1;
		
		for(i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("fact of"+num+" is:"+fact);
		}
		
}
