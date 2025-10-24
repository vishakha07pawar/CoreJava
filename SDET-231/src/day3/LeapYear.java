package day3;

import java.util.Scanner;

public class LeapYear {
	
	Scanner sc = new Scanner(System.in);
	
	
	void checkLeapyear() {
		System.out.println("please Enter The Year:- ");
		int year = sc.nextInt();
		
		//check the year range
		if(year >= 2000 && year <= 2100) {
			if( (year%4==0 && year%100!=0)||(year%400==0))
			{
			 
				System.out.println("This" + year +"is a leapyear");
			}
			else {
				System.out.println("This" + year +"is not a leapyear");
			}
		
			
		}
		
		//checkLeapyear();
		sc.close();
		
	}

	public static void main(String[] args) {
		
		LeapYear LP= new LeapYear();
		LP.checkLeapyear();
		
		
		

	}

}
