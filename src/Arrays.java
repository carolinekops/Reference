
public class Arrays {
public static void main(String[] args) {
//different ways to declare 
	//int[] arr;
	//or
	int[] arr = new int[4]; //number of elements not index
	//if you know values...
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;

	//for is to find INDEX in array
	for(int x = 0; x<arr.length; x++) { //x is index number
		System.out.println(x);
		
	}
	//FOR EACH is used to transverse ELEMENTS in array
	int[] primes = {2,3,5,7};
	for(int y: primes) { 
		System.out.println(y);
	}
	//creating MULTIDIMENSIONAL arrays
	int[][]sample= {{1,2,3},{4,5,6}}; //this is an array with arrays as elements
	int z = sample[1][0];
	System.out.println(z);
	//returns 4, because [1] means second array, [0] means 0th index of [1] array
	
}
}
