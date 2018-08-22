import java.util.ArrayList;

/*
 * Write a program that creates Wrapper Objects, implements
 * auto-boxing and unboxing, converts String to Double using valueOf, 
 * converts String to Integer using parseInt. 
 * The strings that you convert will come from Command Line Arguments.
 */
public class AutoboxUnbox {
//AUTOBOXING
public static void autobox(Integer x) {
	System.out.println(x);
}
public static void unbox(int y) {
	System.out.println(y);
}

public static void main(String[] args) {
//String to Double using valueOf
	double d = 342798.24839;
String.valueOf(d);

//String to int using parseInt
String numb = "123";
int numb2 = Integer.parseInt(numb);
System.out.println(numb2);

//autoboxing into array
ArrayList<Integer> arrayEx = new ArrayList<Integer>();
arrayEx.add(1);
arrayEx.add(12);
arrayEx.add(189);

//autobox, primitive to object
autobox(6);
//unbox, object to primitive
Integer abc = new Integer(9);
unbox(abc);

}
}
