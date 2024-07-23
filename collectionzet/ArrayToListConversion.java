package collectionzet;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayToListConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array size:");
int n=sc.nextInt();

int a[]=new int[n];
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}
TreeSet<Integer> ts=new TreeSet<Integer>();
for(int t:a) {
	ts.add(t); //converting array to array list
}
System.out.println(ts);
sc.close();
	}

}
