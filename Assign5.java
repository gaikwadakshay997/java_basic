////5. WAP to reverse the given number
package A2;
import java.util.Scanner;
public class Assign5 
{
	public static void main(String[] args)
	{
		int num,rem,rev=0;
		System.out.println("enter a number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		System.out.println("revision number:"+rev);
	}

}
