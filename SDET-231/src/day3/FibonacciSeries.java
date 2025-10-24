package day3;

import java.util.Scanner;

public class FibonacciSeries {
	
      
    public static int calculateNthFibonacci(int n) {
       
        if (n <= 1) {
            return n;
        } 
        
        else {
            return calculateNthFibonacci(n - 1) + calculateNthFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please Enter the number");
    	int n=sc.nextInt();
    	sc.close();
        
        int result = calculateNthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result); 
    }

}
