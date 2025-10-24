package day2;

import java.util.Scanner;

public class EmployeeSalary {
	double taxrate = 0.05;
	int level ,boa,basic,bonus;
	double pf,monthlysalary,yearlysalary,yearlytax,monthlytax;
	
	Scanner sc =new Scanner(System.in);

	double calculateSalaryByLevel() {

		System.out.println("Please Enter Employee Level or Experience :-");
		int level = sc.nextInt();
		if (level==1) {
			basic = 7000;
			boa = 5000;
			bonus= 2000;
			calculateSalary();


		}
		else if(level==2){
			basic = 10000;
			boa = 7000;
			bonus= 2500;
			calculateSalary();

		}
		else if(level==3){
			basic = 12000;
			boa = 9000;
			bonus= 3000;
			calculateSalary();
		}
		else if(level==4){
			basic = 15000;
			boa = 10000;
			bonus= 3500;
			calculateSalary();
		}
		return monthlysalary;


	} 
	void calculateSalary() {
		pf = basic *0.12;
		monthlysalary = (basic +boa+bonus)-pf;
		yearlysalary = monthlysalary*12;
		yearlytax = yearlysalary*taxrate;
		monthlytax = yearlytax/12;
	}



	public static void main(String[] args) {

		EmployeeSalary emp = new EmployeeSalary();
		double salary =emp.calculateSalaryByLevel();

		System.out.println("Employee's"+"\n"+"Pf is:" +emp.pf + "\n"+"MonthlySalary is: "+salary +
				"\n"+"YearlySalary is : "+emp.yearlysalary+"\n"+"YearlyTax is : "+emp.yearlytax+""+"\n"+ "MonthlyTax is: "+ emp.monthlytax);

	}

}
