
public class TypeCasting {
public static void main(String[] args) {
	

//Implicit type casting, small to large

//Explicit  type casting, large to small
double example = 87.6;
int newexample = (int)example;

//byte to int
int x = 132;
byte y =(byte)x; //output is -124.  you subtract 256
System.out.println(y);

int z = -479;
byte a = (byte)z;
System.out.println(a); //output is 33

}
}