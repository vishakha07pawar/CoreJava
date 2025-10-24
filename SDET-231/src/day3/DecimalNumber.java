package day3;

import java.util.Scanner;

public class DecimalNumber {
	
	void convertFromDecimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Decimal number:- ");
		int decimalnumb = sc.nextInt();
		String binarynum =  Integer.toBinaryString(decimalnumb);
		System.out.println("Binary number of this number is: "+binarynum);
		
		String octalstring = Integer.toOctalString(decimalnumb);
		System.out.println("Octal number of this number is: "+octalstring);
		String hexadecimal= Integer.toHexString(decimalnumb);
		System.out.println("Hexadecimal number of this number is: "+hexadecimal.toUpperCase());
		sc.close();
		
	}

	public static void main(String[] args) {
		DecimalNumber dc= new DecimalNumber();
		dc.convertFromDecimal();
	

	}

}
