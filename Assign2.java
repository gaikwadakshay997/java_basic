//2. WAP to check whether a given year is a LEAP year
package A2;
import java.util.Scanner;
public class Assign2 

{
	public static void main(String[] args)
	{
		int year;
		
		System.out.println("enter year:");
		Scanner s = new Scanner(System.in);
		
		year = s.nextInt();
		
		if(year%4==0)
		{
			System.out.println(+year+""+"leap year");
		}
		else
		{
			System.out.println(+year+""+"not leap year");
		}
	}
	
}
