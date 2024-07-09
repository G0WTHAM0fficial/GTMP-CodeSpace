package NumbersTypeQue;

import java.util.Scanner;

public class SpecialNumber {
//sum of the given digit + product of the given digit equal eg:5+9 + 5*9 = 59
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to Check SpecialNumber:");
		int n = sc.nextInt();
		int m = n;// copy
		int sum = 0, prod = 1;
		while (n != 0) {
			int d = n % 10;//remainder
			sum = sum + d;prod = prod * d;//logic
			n = n / 10;
		}
		if ((sum + prod) == m)//logic comparison
			System.out.println("Special Number");
		else
			System.out.println("Not Special Number");
		sc.close();

	}

}
