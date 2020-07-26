package gp;

import java.util.Scanner;

public class Game {
	public static void main(String s[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter then number of disks");
		int number = sc.nextInt();
		Hanoi game = new Hanoi(number);
		game.initA();
		game.move(number, game.A, game.B, game.C);
	}
}
