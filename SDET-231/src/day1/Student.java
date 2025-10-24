package day1;

import java.util.Scanner;

public class Student {
	
	double maths,english,science,history,totalmarks,average;
	Scanner sc = new Scanner(System.in);
	void student_getmarks() {
		
		System.out.println("Enter math marks:-");
		maths = sc.nextDouble();
		
		System.out.println("Enter english marks:-");
		english = sc.nextDouble();
		
		System.out.println("Enter science marks:-");
		science = sc.nextDouble();
		
		System.out.println("Enter history marks:-");
		history = sc.nextDouble();
	
	}
	
	void student_totalmarks() {
	    totalmarks = maths + english + science + history;
	    System.out.println("Student's total marks = "+ totalmarks);
	}
	void student_average() {
		
		average = (totalmarks)/4;
		
		System.out.println("Student's average marks = "+ average);
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		Student stud1 = new Student();
		System.out.println("Student1 Enter Marks:- ");
	     stud1.student_getmarks();
	     stud1.student_totalmarks();
	     stud1.student_average();
	     
		Student stud2 = new Student();
		System.out.println("Student2 Enter Marks:- ");
	     stud2.student_getmarks();
	     stud2.student_totalmarks();
	     stud2.student_average();
	     
		Student stud3 = new Student();
		System.out.println("Student3 Enter Marks:- ");
	     stud3.student_getmarks();
	     stud3.student_totalmarks();
	     stud3.student_average();
	     
		Student stud4 = new Student();
		System.out.println("Student4 Enter Marks:- ");
	     stud4.student_getmarks();
	     stud4.student_totalmarks();
	     stud4.student_average();
		
		
		/*Student john = new Student();
		john.english = 50;
		john.maths = 90;
		john.history = 80;
		john.science = 60;
		float totalmarks1 = john.maths + john.english + john.science + john.history;
		System.out.println("John's total marks = "+ totalmarks1);
		float average1 = (john.maths + john.english + john.science + john.history)/4;
		System.out.println("John's average = "+ average1);
		
		Student mary = new Student();
		mary.english = 40;
		mary.maths = 90;
		mary.history = 80;
		mary.science = 70;
		float totalmarks2 = mary.maths + mary.english + mary.science + mary.history;
		System.out.println("Mary total marks = "+ totalmarks2);
		float average2 = (mary.maths + mary.english + mary.science + mary.history)/4;
		System.out.println("Mary's average = "+ average2);
		
		Student jacob = new Student();
		jacob.english = 70;
		jacob.maths = 95;
		jacob.history = 62;
		jacob.science = 70;
		float totalmarks3 = jacob.maths + jacob.english + jacob.science + jacob.history;
		System.out.println("Jacob total marks = "+ totalmarks3);
		float average3 = (jacob.maths + jacob.english + jacob.science + jacob.history)/4;
		System.out.println("Jacob's average = "+ average3);
		
		Student ben = new Student();
		ben.english = 90;
		ben.maths = 90;
		ben.history = 60;
		ben.science = 75;
		
		float totalmarks4 = ben.maths + ben.english + ben.science + ben.history;
		System.out.println("Ben's total marks = "+ totalmarks4);
		float average4 = (ben.maths + ben.english + ben.science + ben.history)/4;
		System.out.println("ben's average = "+ average4);*/
		
	
	}

}
