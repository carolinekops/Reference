import java.util.*;

public class Collections {
	
public static void main(String[] args) {
	ArrayList<Integer> myList = new ArrayList<Integer>(); //array list is class name
	myList.add(7); //autoboxes to Integer obj
	myList.add(77);
	myList.add(9);
	myList.add(92);
	myList.add(71);
	System.out.println(myList);
	System.out.println(myList.size());
	System.out.println(myList.isEmpty());
	System.out.println(myList.contains(7));
	
	//remove either takes int index or object
	myList.remove(new Integer(71)); //turns into object and removes
	
	int a = 2;
	myList.remove(a); //will remove element at index 2
	
	myList.add(3, 99); //doesnt replace
	System.out.println(myList);
	
	ArrayList<String> names = new ArrayList<String> ();
	names.add("Reeeta");
	
	//how to get from index
	names.get(0);
	//for each loop. cannot add within
	for(String i : names) {
		System.out.println(i);
	}
	
	ArrayList<String> nums = new ArrayList<String>();
	nums.add("1");
	nums.add("1");
	nums.add("1");
	System.out.println("BEFORE REMOVE: ");
	Iterator i = nums.iterator();
	while(i.hasNext()) {
		System.out.println(i.next()); //or i.remove()
		
		Hashtable h = new Hashtable();
		h.put(3, "caroline");
        h.put(2, "Im");
        h.put(1, "hi");
        System.out.println(h);
	}
}
}
