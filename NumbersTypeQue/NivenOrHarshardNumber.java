package NumbersTypeQue;

import java.util.Scanner;

//sum of the given digit of number is divisible by given number
//eg:156=1+5+6=12 if 156/12 then condition satisfies 
public class NivenOrHarshardNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to Check Harshard Number:");
		int n = sc.nextInt();
		int m = n;// copy
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		if (m % sum == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not Harshad Number");
		sc.close();

	}
}
