package NumbersTypeQue;

import java.util.Scanner;

public class KrishnaMoorthyNumberOrSpecialNumber {
//check the factorial of each given digits is equal to given number
//given no is 145 then 1!+4!+5!=145
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check KMNumber:");
		int n = sc.nextInt();
		int m = n;// copy
		int sum = 0;

		while (n != 0) {
			int d = n % 10;
			int f = 1;
			for (int i = 1; i <= d; i++)
				f = f * i;// factorial logic
			sum = sum + f;
			n = n / 10;
		}
		if (sum == m)
			System.out.println("KM special Number");
		else
			System.out.println("Not KM special Number");
		sc.close();
	}
}
