//WAP to check whether a person is eligible for voting
package A2;
import java.util.Scanner;
public class Assign1 
{
	public static void main(String[] args)
	{
		int age;
		System.out.println("enter age:");
		Scanner s = new Scanner(System.in);
		
		age = s.nextInt();
		
		if(age>18)
		{
			System.out.println(+age+"eligible for voting");
		}
		
		else
		{
			System.out.println(+age+"not eligible for voting");
		}
	}

}
