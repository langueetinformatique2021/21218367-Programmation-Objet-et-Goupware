package devoirTD7;

import java.util.Scanner;

public class testCalendar2 {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		Calendar2 c = new Calendar2();
		c.creation();
		System.out.println("attente");
		entree.nextInt();
		entree.close();
		c.creation();
		c.afficher();
		c.duree();

	}

}
