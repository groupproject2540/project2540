package gp;

import java.util.Scanner;

public class Game {
	public static void main(String s[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter then number of disks");
		int number = sc.nextInt();
		Hanoi game = new Hanoi(number);
		game.initA();
		while(true) {
		System.out.println("1.Start paly\n2.Check ans\n3.Exit");
		int c =sc.nextInt();
		switch(c) {
		case 1:
			game.playpart(number);	
			break;
							
		case 2:
			int step=game.move(number, game.A, game.B, game.C);
			System.out.println("Use "+step+" step");
			break;
			
		case 3:
			System.out.println("byby");
			return;
		
		default:
			System.out.println("error, wrong input");
		}
	 }
	}
}
