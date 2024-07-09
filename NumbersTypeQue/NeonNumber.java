package NumbersTypeQue;

import java.util.Scanner;

//check the sum of the square of given number is equal to given number
//eg:9 9*9=81 8+1=9
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to check Neon Number:");
		int n = sc.nextInt();
		int sqr = n * n;
		int sum = 0;
		while (sqr != 0) {
			int d = sqr % 10;
			sum = sum + d;
			sqr = sqr / 10;
		}
		if (sum == n)
			System.out.println("Neon Number");
		else
			System.out.println("Not Neon Number");
		sc.close();
	}

}
