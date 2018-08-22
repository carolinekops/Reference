
public class StringMethods {
	String x = "hello";
	String y = "Hello";
	String fruit = "apples";
	//char as array
	char [] char1 = fruit.toCharArray();
	System.out.println("first letter is : " + char1[0]);
	System.out.println("first letter is : " + char1[2]);  //if out of bounds it will say index out of bounds
	System.out.println(char1.length);
	
	System.out.println(x.equals(y)); //false
	System.out.println(x.length()); //5
	System.out.println(x.endsWith("lo")); //true
	//ignoreCase if one is a and another is A
	System.out.println(x.equalsIgnoreCase(y)); //true, ignores case
	System.out.println(x.toLowerCase()); //hello
	System.out.println(y.toUpperCase()); //HELLO
	System.out.println(x.startsWith("he")); //true
	System.out.println(x.contains("ello")); //true
	System.out.println(y.toLowerCase().contains("he")); //true
	System.out.println(x.toLowerCase());
}
