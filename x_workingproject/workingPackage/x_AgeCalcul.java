

/*package workingPackage;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class AgeCalcul
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		String age = "2010, 4, 3" ;
	
		try {
			java.util.Date dob = new SimpleDateFormat("yyyy,MM,dd").parse(age);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		{
			System.out.println("Please enter your age : ");
			age = input.next();
			System.out.println("Your age is " +age);
			
		}
		
		
		LocalDate today = LocalDate.now();                          //Today's date
//		LocalDate birthday = LocalDate.of(2010, Month.APRIL, 3);  //Birth date
//		LocalDate birthday = LocalDate.of(2010, 4, 3);  //Birth date 
//		LocalDate birthday = LocalDate.of("dob"); 
	//	System.out.println( birthday.dob);//Birth date 
//		Period p = Period.between(birthday, today);
		 
		
		//Now access the values as below
//		System.out.println("Your age is : " +p.getYears() +" years, " +p.getMonths() +" months, " +p.getDays() +" days.");
		
		//System.out.println(p.getDays());
		//System.out.println(p.getMonths());
		//System.out.println(p.getYears());
	}
}*/
 /*package workingPackage;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class AgeCalcul 
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner input = new Scanner(System.in);
		String age;
		
//		String age2 = age;
		System.out.println("Please enter your date of birth : ");
		age = input.next();
		
		System.out.println(" your Date Of Birth  is  : " +age);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");	       
		Calendar calobj = Calendar.getInstance();
	    System.out.println( "Todays date is : " + df.format(calobj.getTime()));
	    
	    DateFormat dob = new SimpleDateFormat("dd/MM/yyyy");
//	    Calendar calobj2 = Calendar.getInstance();
	    java.util.Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(age);
//	    LocalDate birthday = LocalDate.of("date1"); 
	    System.out.println( "Your entered date is : " + dob.format(date1));
	    
	    
//	    java.util.Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(age);
//	    String age2 =  df.format(calobj.getTime())- date1;
//	    Period p = Period.between(dob.format(date1), df.format(calobj.getTime()));
	    System.out.println(" Your age is : " +(df.format(calobj.getTime())-dob.format(date1)));
	
		
	}
}*/

package  workingPackage;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 

public class x_AgeCalcul {
 
    public static void main(String[] args) {
    

    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");    
    	LocalDate today = LocalDate.now();
    	LocalDate birthday = LocalDate.parse("1/1/1960", formatter);


    	Period p = Period.between(birthday, today);
    	System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
    	                   " months and " + p.getDays() +
    	                   " days old.");
    }
 
}



