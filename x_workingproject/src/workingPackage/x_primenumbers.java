package workingPackage;
import java.util.Scanner;

public class x_primenumbers {
	public static void main(String args[])
	{
		double x = 0.00  ;
		int i;
		int y = 0;
		double j;
		Scanner input = new Scanner(System.in);
		System.out.println("This program will print list of prime numbers.");
		System.out.println("Enter a number.");
		x = input.nextDouble();
		System.out.println("Value entered is : " +x);
		System.out.println("Rounded value is : " +Math.round(x));
		System.out.println("Below is the list of Prime Numbers till " +x);
		
		for(j=1; j<=x; j++)
		{
			for(i=1; i<j; i++)
			{
				if (j/i == Math.round(j/i))
				{
					y = y + 1;
			    }
		     }
		
		//	System.out.println("Value of 'y' is : " +y);
			if(y==1)
			{
				System.out.println(j);
			}
			
			else
			{
			//	System.out.println("This is not a Prime number");
			}
			y=0;
		 }
	}

	}


