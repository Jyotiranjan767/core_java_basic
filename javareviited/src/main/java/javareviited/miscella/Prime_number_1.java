package javareviited.miscella;

public class Prime_number_1 {
	
		public static void prime(float e){
			boolean flag =  true;
			for(int i = 2; i< Math.sqrt(e); i++){
				if(e == 2)
					System.out.println("it is a prime number ");
				else if(e%i == 0){
//					System.out.println(e + "  is not a prime number");
					flag = false;
					break ;
				}
			}if(!flag)
				System.out.println(e+ " is not a prime number");
			else System.out.println(e+ " is a prime number");
		}
		public static void main(String ritu[]){
			
			Prime_number_1.prime(743);
			
		}
}
