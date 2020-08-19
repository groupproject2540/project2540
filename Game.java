package gp;

import java.util.Scanner;

public class Game {
	public static void main(String s[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter then number of disks");
		int number = sc.nextInt();
		Hanoi game = new Hanoi(number);
		game.initA();
		/*
		while(true) {
	 	System.out.println("1.Start paly\n2.Check ans\n3.Exit");

		int c =sc.nextInt();
		switch(c) {
		case 1:
			game.playpart(number);	
			game.f5();
			break;
							
		case 2:
			int st=game.move(number, game.A, game.B, game.C);
			System.out.println("Use "+st+" step\n");
			game.f5(); //reset all stack
			break;
			
		case 3:
			System.out.println("byby");
			return;
		
		default:
			System.out.println("error, wrong input");
		}
	 }
	 */
		int st=game.move(number, game.A, game.B, game.C);
		System.out.println("Use "+st+" step\n");
		return;
		
	}
}
