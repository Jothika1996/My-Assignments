package week1.assignment3;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12321;
		int reversedNum = 0;
		int temp = num;
		
		while(temp!=0) {
			int remainder = temp % 10;
			reversedNum = reversedNum * 10 + remainder;
			temp /= 10;
		}
		if(num == reversedNum) {
			System.out.println(num + " is Palindrome");
		}
		else {
			System.out.println(num + " is not Palindrome");
			
		}
		// TODO Auto-generated method stub

	}

}
