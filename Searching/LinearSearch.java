package Searching;

public class LinearSearch { //Linear or Sequential searching

	public static void main(String[] args) {
		int a[] = { 7, 8, 21, 1, 4 };//array
		int t = 1;//target
		for (int i = 0; i < a.length; i++) {
			if (a[i] == t) //search one by one
			System.out.println(a[i] + " is Element Found in index:" + i);
		}
	}
}
