package codingpractice;

public class Number {
	
	public static boolean IsPrime(int num) {
		
		if(num <=1) {
			
			return false;
		}
		else {
			for(int n =2; n<num;n++) {
				if(num%n==0) {
					return false;
					
				
			}
			
			}
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		
	if(IsPrime(7)) {
		System.out.println("Number is prime");
	}
	else
		System.out.println("Numbe is not prime");
	}

}
