package devoirTD7;

public class testCercle {
	
	public static void main(String[] args) {
		Cercle un = new Cercle("rouge", 5);
		Cercle deux = new Cercle("blanc", 20);
		System.out.println("This is the first cercle : ");
		un.afficher();
		System.out.println("\nThis is the second cercle : ");
		deux.afficher();
		un.compare(deux);

}
}
