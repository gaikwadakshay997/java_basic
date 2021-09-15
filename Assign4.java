//4. WAP to find whether a given number is an Armstrong number
package A2;
import java.util.Scanner;
public class Assign4
{
	public static void main(String[] args)
	{
		int num,r,temp,sum=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter any number:");
		num = s.nextInt();
		temp = num;
		
		while(num!=0)
		{
			r = num%10;
			sum = sum+(r*r*r);
			num = num/10;
			
		}
		if(sum==temp)
		{
			System.out.println("it is an armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
			
	}

}
