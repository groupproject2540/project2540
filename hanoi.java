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
            System.out.println("n=" + n + " " + from + "-->" + to);  
            s++;
        }
		else{  
            hanoi(n-1,from,to,pass);  
            System.out.println("n=" + n + " " + from + "-->" + to);  
            hanoi(n-1,pass,from,to);  
            s++;
        }
	}


}
