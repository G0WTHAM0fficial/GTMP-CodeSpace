package collectionzet;

import java.util.Scanner;
import java.util.TreeSet;

public class CompileTimeArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
TreeSet<Integer> al=new TreeSet<Integer>();
//Enter the value size
System.out.print("size:");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
	int ins=sc.nextInt();
	al.add(ins);
}
System.out.println(al);
sc.close();
	}

}
