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
    	String difference ;
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Welcome to Age Calculator.");
    	System.out.println("please enter your name : ");
    	name1 = input.next();
    	System.out.println( name1 + " Please enter your date of birth in the format 'DD/MM/YYYY");
       	dob1 = input.next();
       	System.out.println("please enter another name  : ");
       	name2 = input.next();
       	System.out.println(name2 + " Please enter the date of birth of yours  ");
       	dob2 = input.next();
    
    	LocalDate birthday1 = LocalDate.parse(dob1, formatter);
    	LocalDate birthday2 = LocalDate.parse(dob2, formatter);

    	Period p1 = Period.between(birthday1, today);
    	Period p2 = Period.between(birthday2, today);
    	System.out.println(name1 + " age is  " + p1.getYears() + " years, " + p1.getMonths() + " months and " + p1.getDays() +   " days old.");
    	System.out.println(name2 + " age is " + p2.getYears() + " years, " + p2.getMonths() + " months and " + p2.getDays() +   " days old.");
    	dob1 = formatter.format( birthday1 );
    	dob2 = formatter.format( birthday2 );
    	
 //   	System.out.println("The difference between the two birthdays is " + difference.getYears() + " years, " + difference.getMonths() + " months and " + difference.getDays() +   " days old.");
    	Period difference1 = Period.between(birthday2, birthday1);
       	System.out.println("The difference between the two birthdays is : " + difference1);
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