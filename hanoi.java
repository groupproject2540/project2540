package pg;

import java.util.Scanner;

public class hanoi {  // how hanoi work

	static long s = 0;
	 
	public static void main(String args[]) {
 
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//Number of layers
		System.out.println("Number of layers = " + n);
		hanoi(n, 'a', 'b', 'c');
		System.out.println("need " + s+ "step ");
 
	}
 
	static void hanoi(int n, char from, char pass, char to) { 
		if (n == 1){  
            System.out.println("n=" + n + " " + a + "-->" + c);  
            s++;
        }
		else{  
            hanoi(n-1,a,c,b);  
            System.out.println("n=" + n + " " + a + "-->" + c);  
            hanoi(n-1,b,a,c);  
            s++;
        }
	}


}
