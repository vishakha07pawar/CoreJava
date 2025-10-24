package day3;

import java.util.Scanner;

public class NumberWeek {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number From 1-7 To Select The Day Of The Week: ");
		int daynumb = sc.nextInt();
		String dayname = "";
		switch (daynumb) {
		
		case 1:
		dayname="Sunday";
			
			break;
		case 2:
			dayname="Monday";
				
				break;
		case 3:
			dayname="Tuesday";
				
				break;
		case 4:
			dayname="Wednesday";
				
				break;
		case 5:
			dayname="Thursday";
				
				break;
		case 6:
			dayname="Friday";
				
				break;
		case 7:
			dayname="Sunday";
				
				break;

		default:
			System.out.println("Please enter the valid day number between 1-7");
			break;
		}
     System.out.println("For The Number "+ daynumb +" the day of the week is "+ dayname );
     sc.close();
	}
	
	

}
