package devoirTD7;

public class testCercle {
	
	public static void main(String[] args) {
		Cercle un = new Cercle("rouge", 5);
		Cercle deux = new Cercle("blanc", 20);
		System.out.println("C'est le premier cercle : ");
		un.afficher();
		System.out.println("\nCeci est le second cercle : ");
		deux.afficher();
		un.compare(deux);

}
}
