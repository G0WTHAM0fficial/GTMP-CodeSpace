package collectionzet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

public static void main(String[] args) {
TreeSet<Integer> ts=new TreeSet<Integer>(Comparator.reverseOrder());
//TreeSet<Integer> ts=new TreeSet<Integer>
ts.add(5);
ts.add(4);
ts.add(3);
ts.add(3);
ts.add(6);
ts.add(9);
System.out.println(ts);  
}
}
