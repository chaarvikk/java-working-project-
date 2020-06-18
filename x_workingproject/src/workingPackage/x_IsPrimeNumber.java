package workingPackage;
import java.util.Scanner;

public class x_IsPrimeNumber {
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		double x = 0.00  ;
		int i;
		int y = 0;
		int j = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value to check if it a prime number : ");
		x = input.nextDouble();
		System.out.println("Value entered is : " +x);
		System.out.println("Rounded value is : " +Math.round(x));
		
		
		for(i=1; i<x; i++)
		{
			if (x/i == Math.round(x/i))
			{
				y = y + 1;
				//	System.out.println("chaarvi");
			}
			else
			{
				//	System.out.println("sagar");
			}		
		}
//		System.out.println("Value of 'y' is : " +y);
		if(y==1)
		{
		System.out.println("Hurray!!! This is a Prime number");
		}
		else
		{
			System.out.println("         ");
			System.out.println("*********");
			System.out.println("Result : ");
			System.out.println("*********");
			System.out.println("Oops... This is NOT a Prime number");
			y = 0;
		}
	}



	}


