package workingPackage;

public class X_fibbonacciseries
{
	public static void main (String [] args)
	{
		int a = 0;
		int b = 1;
		int c;
		int  total = 100;
	//	System.out.println(a + " " + b);
		for( c = 2; c <= total; c++)
		{
			c = a + b;
			System.out.println("" +c);
			a = b;
			b = c;
		}
		
	}

}
