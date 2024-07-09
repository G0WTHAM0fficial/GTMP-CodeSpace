package NumbersTypeQue;

import java.util.Scanner;

//sum of the Given number digit = product of the given number digit eg: 1+2+3=1*2*3
public class SpyNumber {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to check SpyNumber:");
		int n = sc.nextInt();
		int sum = 0, prod = 1;
		while (n != 0) {
			int d = n % 10;// remainder
			sum = sum + d;
			prod = prod * d;// logic
			n = n / 10;// elimination
		}
		if (sum == prod)
			System.out.println("Spy Number");
		else
			System.out.println("Not Spy Number");
		sc.close();
		}   

}
