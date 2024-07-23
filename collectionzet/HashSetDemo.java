package collectionzet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

public static void main(String[] args) {
   HashSet<Object> myset=new HashSet<Object>();
   myset.add(10);
   myset.add(20);
   myset.add('a');
   myset.add(10);
   myset.add(null);
   myset.add(null);
   System.out.println(myset);
   
   //remove
   myset.remove(20);
   System.out.println(myset);
   
   //inserting and accessing specific element is not possible in java
   
   //Convert the Hashset to ArrayList and access it
   ArrayList<Object> mylist=new ArrayList<Object>(myset);
   System.out.println(mylist.get(1));
	
	
	//we cannot use normal for loop because it doent have index
	
	//using enhanced for loop
	for(Object x:myset) {
		System.out.print(x+" ");
	}
	//using iterator
	Iterator<Object>it= myset.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");	
	}

	}}
