package workingPackage;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class X_AgeDifference {
 
    public static void main(String[] args) {
    
try {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    
    	LocalDate today = LocalDate.now();	
    	
    	String name1;
    	String name2;
       	String dob1 = "01/12/1960";
    	String dob2 = "02/12/1961";
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Welcome to Age Calculator.");
    	System.out.println("Please enter first persons name : ");
    	name1 = input.next();
    	System.out.println("Please enter " + name1 + "'s date of birth in the format 'DD/MM/YYYY");
       	dob1 = input.next();
       	System.out.println("Please enter second persons name : ");
       	name2 = input.next();
       	System.out.println("Please enter " + name2 + "'s date of birth in the format 'DD/MM/YYYY");
       	dob2 = input.next();
    
    	LocalDate birthday1 = LocalDate.parse(dob1, formatter);
    	LocalDate birthday2 = LocalDate.parse(dob2, formatter);

    	Period p1 = Period.between(birthday1, today);
    	Period p2 = Period.between(birthday2, today);
    	System.out.println(name1 + "'s age is " + p1.getYears() + " years, " + p1.getMonths() + " months and " + p1.getDays() +   " days old.");
    	System.out.println(name2 + "'s age is " + p2.getYears() + " years, " + p2.getMonths() + " months and " + p2.getDays() +   " days old.");
    	
    	Period d1 = Period.between(birthday1, birthday2);
       	System.out.println("The age difference between " + name1 + " and " + name2 + " is : " + d1.getYears() + " years, " + d1.getMonths() + " months and " + d1.getDays() + " days old.");
		}
catch(Exception e)
		{
			System.out.println("Oops you have entered incorrectly. Please re-enter in 'DD/MM/YYYY' format.");
		}
finally 
		{
			System.out.println("Thanks for using 'Age Difference Calculator'.");
		}
  }
}