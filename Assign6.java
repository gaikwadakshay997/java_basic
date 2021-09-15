//6. Generate the Fib… series 1 1 2 3 5 8 13
package A2;
import java.util.Scanner;
public class Assign6 

{
	public static void main(String[] args)
	{
		int num,i,n1=0,n2=1,n3;
		System.out.println("enter rannge:");
		Scanner s  = new Scanner(System.in);
		num = s.nextInt();
		
		for(i = 2; i<num; i++)
		{
			n3 = n1+n2;
			System.out.println(n3);
			
			n1 = n2;
			n2 = n3;
			
		}
	
	}
}
