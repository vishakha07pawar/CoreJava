package day3;

public class ConstructorMarks {
	float m1= 35;
	float m2 = 35;
	float m3 = 35;
	float m4 = 35;
	float sum,average;
	
   void sum() {
	   sum = m1+m2+m3+m4;
	   System.out.println("Sum of the marks is :"+ sum);
			
   }
   void average() {
	   average= (sum)/4;
	   System.out.println("Average of the marks is :"+ average);
   }
	
	public ConstructorMarks(float a,float b,float c,float d) {
		m1= a;
		m2 =b;
		m3 = c;
		m4= d;
		
		
	}
	public ConstructorMarks(float a,float b,float c) {
		m1= a;
		m2 =b;
		m3 = c;
		
		
	}
	public ConstructorMarks(float a,float b) {
		m1= a;
		m2 =b;
		
		
	}
	public ConstructorMarks(float a) {
		m1= a;
		
		
	}
	public ConstructorMarks() {
		
		
	}
	/*void enterMarks() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the marks for four subjects ");
	
	System.out.println("Please Enter mark1");
	m1= sc.nextFloat();
	System.out.println("Please Enter mark2");
	m2= sc.nextFloat();
	System.out.println("Please Enter mark3");
	m3= sc.nextFloat();
	System.out.println("Please Enter mark4");
	m4= sc.nextFloat();
	sc.close();
	
}*/

public static void main(String[] args) {
	
	//ConstructorMarks stud = new ConstructorMarks();
	//stud.enterMarks();
		ConstructorMarks s1 = new ConstructorMarks(70,89,60,50);
		s1.sum();
		s1.average();
		ConstructorMarks s2 = new ConstructorMarks(98,56,90);
		s2.sum();
		s2.average();
		ConstructorMarks s3 = new ConstructorMarks(68,70);
		s3.sum();
		s3.average();
		ConstructorMarks s4 = new ConstructorMarks(70);
		s4.sum();
		s4.average();
		ConstructorMarks s5 = new ConstructorMarks();
		s5.sum();
		s5.average();
		

	}

}
