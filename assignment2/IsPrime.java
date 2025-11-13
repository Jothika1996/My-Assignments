package week1.assignment2;

public class IsPrime {

	
	public static void main(String[] args) {
		int n = 17;
		boolean isPrime = true;
		for(int i=2;i<n/2; i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			
			}
		}
		if (isPrime) {
			System.out.println("The number is Prime"+n);
		}
		else {
			System.out.println("The number is not Prime"+n);
		}
		
		
	}			
}		// TOsysDO Auto-generated method stub
         

