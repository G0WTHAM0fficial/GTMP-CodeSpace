package collectionzet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
//PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//add
pq.add(1);
pq.add(5);
pq.add(3);
pq.add(4);
pq.add(10);
pq.add(15);
pq.add(14);
//print
System.out.println(pq);
System.out.println(pq.peek());//view element in head 
//remove
pq.poll();//remove the elements in fifo
System.out.println(pq);
pq.remove(3);//directly element not index val
System.out.println(pq);
//check the ele present or not
System.out.println(pq.contains(5));
//iterator
Iterator<Integer> it=pq.iterator();
while(it.hasNext()) {
	System.out.print(it.next()+" ");
}
System.out.println();
//while(proper reverse order)
while(!pq.isEmpty()){
	System.out.print(pq.poll()+" ");
}
System.out.println(pq);
}
}
