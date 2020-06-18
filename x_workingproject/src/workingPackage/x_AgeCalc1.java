package workingPackage;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class x_AgeCalc1 
{
	
	static String age = "24/09/2007";
	static String getage1;
	
    public static void xage(String inputage) 
    {
    	age = inputage;

    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    
    	LocalDate today = LocalDate.now();
    	
     	LocalDate birthday = LocalDate.parse(age, formatter);

    	Period p = Period.between(birthday, today);
    	
    	getage1 = "You are " + p.getYears() + " years, " + p.getMonths() +
    	                   " months and " + p.getDays() +
    	                   " days old.";
    }
    
    public static String getAge() 
    {
    	return getage1;	
    }
}