package week1.assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,sum=0;
		System.out.println("Fibonacci Series:" + " ");
		for (int i=1;i<=8; i++) {
			System.out.print(n1+ " ");
			sum= n1+n2;
			n1=n2;
			n2=sum;
			
			
		}
		// TODO Auto-generated method stub

	}

}
