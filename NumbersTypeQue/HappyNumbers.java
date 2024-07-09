package NumbersTypeQue;

import java.util.HashSet;
import java.util.Scanner;

//Input: n = 19
//Output: true
//Explanation:
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1
public class HappyNumbers {

	public static int getval(int n) {
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum + d * d;
			n = n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to Check Happy Number:");
		int n = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		while ((n != 1) && (!hs.contains(n))) {
			hs.add(n);
			n = getval(n); // pass the element get the sum of sq of digit
		}
		if (n == 1)
			System.out.println("Happy Number");
		else
			System.out.println("Not Happy Number");
		sc.close();
	}

}
