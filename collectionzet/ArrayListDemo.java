package collectionzet;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

public static void main(String[] args) {
ArrayList <Object> obj=new ArrayList<Object>();
//add
obj.add(1);
obj.add("Hello");
obj.add('a');
obj.add(true);
//access or reading
System.out.println(obj);
System.out.println(obj.get(2));

//insert
obj.add(2,"GP");

//update
obj.set(2,"GPS");
//remove
//obj.remove(0);
//obj.remove(2);
//obj.clear();


//size of arraylist
System.out.println(obj.size());

//print the array list by normal for loop

for (int i=0;i<=obj.size()-1;i++) {
	System.out.print(obj.get(i)+ " ");
}
System.out.println();

// print the array list by enhanced for loop
for(Object x:obj) {
	System.out.print(x+" ");
}
System.out.println();

//print the array list using iterator
Iterator<Object> it=obj.iterator();
while(it.hasNext()) {
	System.out.print(it.next()+" ");
}
Iterator<Object> gp=obj.iterator();
System.out.println(gp.next());//print only the first element
 
//contains
boolean check = obj.contains("GPS");
System.out.println(check);

ArrayList <Object>obj1=new ArrayList<Object>();
obj1.add('a');
obj1.add(true);

obj.removeAll(obj1); // removes a,true in obj bz obj1 has only a
System.out.println(obj);

obj.clear();//removes entire arraylist

System.out.println(obj);
// check the ArrayList is Empty or not
System.out.println(obj.isEmpty());
}
}
