
public class WhileAndDoWhile {
public static void main(String[] args) {
//WHILE continues while condition is true
	int x = 3;
	while(x>0) {
		System.out.println(x);
		x--;
	} 
//DO WHILE guaranteed to execute at least once.
	int y = 7;
	do {
		System.out.println(y);
		y++;
	}while(y<5);
//LOOP CONTROL
	int z = 1;
	while(z>0) {
		System.out.println(z);
		if(z==4) {
			break;
		}
		z++;
	}
//FOR loop, for(initialize, condition, increment);
	for(int a = 1; a<6; a++) {
		System.out.println(x);
	}
//FOR EACH loops are in ARRAYS
}
}
