package NumbersTypeQue;

import java.util.Scanner;

//check from the last digits the of the sq number is equal to given number
//eg 25 sq of 25=625 || (25)=6(25) present so it is Automorphic number
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to check Automorphic Number:");
		int n = sc.nextInt();
		int sq = n * n, count = 0;
		while (n != 0) {
			int d = n % 10, q = sq % 10;
			if (d != q)
				count++;
			n = n / 10;
			sq = sq / 10;
		}
		if (count == 0)
			System.out.println("Automorphic Number");
		else
			System.out.println("Not AutoMorphic Number");
		sc.close();
	}

}
