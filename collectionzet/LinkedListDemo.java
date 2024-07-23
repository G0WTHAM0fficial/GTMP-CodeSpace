package collectionzet;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
LinkedList<Integer> li=new LinkedList<Integer>();
//add
li.add(1);
li.add(2);
li.add(3);
//insert
li.add(2,4);
//update
li.set(1,5);
System.out.println(li);
//add in first and last
li.addFirst(0);
System.out.println(li);
li.addLast(6);
System.out.println(li);
//remove first and last
li.removeFirst();
li.removeLast();
System.out.println(li);
//for loop read
for(int i=0;i<li.size();i++) {
	System.out.print(li.get(i)+" ");
}
System.out.println();
//for each loop
for(int x:li) {
	System.out.print(x+" ");
}
System.out.println();
//iterator
Iterator <Integer> it=li.iterator();
while(it.hasNext()) {
	System.out.print(it.next()+" ");
}
}
}
