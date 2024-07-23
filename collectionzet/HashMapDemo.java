package collectionzet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

public static void main(String[] args) {
HashMap<Integer,String> obj=new HashMap<Integer,String>();
//add
obj.put(1, "Gowtham");
obj.put(2, "Gunal");
obj.put(3, "Vignesh");
//remove
obj.remove(3);
//access specific
System.out.println(obj.get(1));
//access entire
System.out.print(obj); //curly brackets
System.out.println(obj.entrySet()); //square brackets
//access key
System.out.println(obj.keySet());
//access value
System.out.println(obj.values());
//size
System.out.println(obj.size());
//reading using foreach loop
for(int x:obj.keySet()) { // int is keyset datatype
	System.out.println(x+" --> "+obj.get(x));
}
//reading using Iterator
Iterator<Entry<Integer, String>> it=obj.entrySet().iterator();
while(it.hasNext()) {
	//System.out.print(it.next()+" ");
	Entry<Integer,String> entry=it.next();
	System.out.println(entry.getKey()+" ==> "+entry.getValue());
}
}
}
