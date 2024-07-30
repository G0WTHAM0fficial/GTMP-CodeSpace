package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 7, 10, 11 };// always in incremental order
		int t = 5;
		int l = 0, r = a.length - 1, mid = l+(l - r) / 2;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == t) // target and element in same position
				System.out.println(t + " found in index " + i);
			else if (a[i] > t) // element is greater than target
				l = mid + 1;
			else
				r = mid - 1; // element is less than target
		}
	}

}
