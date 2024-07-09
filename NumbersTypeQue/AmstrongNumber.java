package NumbersTypeQue;

import java.util.Scanner;

public class AmstrongNumber {
//check the sum of cube of given number digits equal to given number
//eg: 153 is given 1^3+5^3+3^3=153 which is known as Amstrong Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to check Amstrong Number:");
		int n = sc.nextInt(), sum = 0;
		int m = n;
		while (n != 0) {
			int d = n % 10;
			sum = sum + (d * d * d);
			n = n / 10;
		}
		if (m == sum)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not Amstrong Number");
		sc.close();
	}
}
