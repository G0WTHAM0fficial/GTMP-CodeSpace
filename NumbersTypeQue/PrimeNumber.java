package NumbersTypeQue;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to check Prime Number:");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)// divisible by 1 and same number so count becomes 2 when prime no
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
		sc.close();
	}

}
