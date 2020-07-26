package gp;

import java.util.Scanner;

public class Game {
	public static void main(String s[]) {
		Scanner sc = new Scanner (System.in);
		System.out.printf("enter then number of disks");
		int number = sc.nextInt();
		Hanoi game = new Hanoi(number);
		game.move(number, game.A, game.C, game.B);
	}
}
