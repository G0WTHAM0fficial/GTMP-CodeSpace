package NumbersTypeQue;
//eg: 121 reverse 121 which is palindrome Number
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.print("Enter the Number to Check Palindrome:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=n;//to take the copy to check
		int sum = 0;
		while (n != 0) {
			int d = n % 10;// to get remainder or last digit
			sum = sum*10 + d;
			n = n / 10;// to eliminate the last digit
		}
		if (sum == m)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
		sc.close();
	}

}
