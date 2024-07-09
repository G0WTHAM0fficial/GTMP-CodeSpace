package NumbersTypeQue;

import java.util.Scanner;

/*The first 5 perfect numbers are 6, 28, 496, 8128, and 33550336.
consider divisor of 6 is 1,2,3 sum of 1+2+3=6 same number */
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Perfect Number:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum = sum + i; // to store sum of the divisor to check
		}
		if (n == sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
		sc.close();
	}

}
