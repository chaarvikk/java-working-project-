package workingPackage;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class X_AgeCalcOld {
 
    public static void main(String[] args) {
    
try {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    
    	LocalDate today = LocalDate.now();
    	
    	
    	Scanner input = new Scanner(System.in);
    	String dob = "01/12/1960";
    	
    	System.out.println("Welcome to Age Calculator.");
    	System.out.println("Please enter your Date of Birth in the format 'DD/MM/YYYY");
    	
    	//dob = input.next();
    	dob = input.next();
    	
	//LocalDate birthday = LocalDate.parse("01/12/1960", formatter);
    	LocalDate birthday = LocalDate.parse(dob, formatter);

    	Period p = Period.between(birthday, today);
    	System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
    	                   " months and " + p.getDays() +
    	                   " days old.");
	}
	catch(Exception e)
	{
		System.out.println("Oops you have entered incorrectly. Please re-enter in 'DD/MM/YYYY' format.");
	}
	finally 
	{
		System.out.println("Thanks for using 'Age Calculator'.");
	}
  }
 
}