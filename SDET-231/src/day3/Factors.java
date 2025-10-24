package day3;

import java.util.Scanner;

public class Factors {
 
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a positive integer: ");
	        int number = input.nextInt();

	        if (number <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            printFactorsAndCount(number);
	        }

	        input.close();
	    }

	    public static void printFactorsAndCount(int num) {
	        System.out.print("Factors of " + num + " are: ");
	        int factorCount = 0;

	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.print(i + " ");
	                factorCount++;
	            }
	        }
	        System.out.println("\nTotal number of factors: " + factorCount);
	    }

	}

