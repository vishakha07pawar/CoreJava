package day3;



public class PrimeNumber {
	   
   public static void main(String[] args) {
		 int num=2;
			int count=0;
					
			
			System.out.println("The first 30 prime numbers are ");
			while(count<30)
			{
				boolean isprime=true;
			
			
			
				for(int i=2;i <=Math.sqrt(num);i++)
				{
					
						if(num%i==0)
						{
							isprime=false;
							break;
						}
										
				}
			
			if(isprime)
			{
				System.out.println(num);
				count++;
				
			}
			num++;
			}
	

	}

}
