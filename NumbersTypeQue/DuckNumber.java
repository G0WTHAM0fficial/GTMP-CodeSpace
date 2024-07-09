package NumbersTypeQue;

import java.util.Scanner;

//check the number has zero or not eg:108,510
public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to Check DuckNumber:");
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {
			int d = n % 10;// remainder
			if (d == 0) // flag if the 0 present
				count++;
			n = n / 10;
		}
		if (count > 0)//if zero present then it is not zero
			System.out.println("Duck Number");
		else
			System.out.println("Not Duck Number");
		sc.close();
	}
}
