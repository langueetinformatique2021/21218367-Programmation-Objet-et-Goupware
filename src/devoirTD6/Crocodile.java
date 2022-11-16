package devoirTD6;

public class Crocodile extends Reptile {
	
	private boolean dimorphismesexuel_corps = true;
	
	public Crocodile(String type) {
		super(type);
		System.out.println("je terrorise les humains avec ma grande machoire.");
		avoirUnLongMuseauTriangulaire();
		System.out.println("Je " + (dimorphismesexuel_corps ? "présente " : "ne présente pas ") + "un dimorphisme sexuel au niveau "
				+ "de la taille du corps.");
	}
	
	public void avoirUnLongMuseauTriangulaire () {
		System.out.println("J'ai un long museau triangulaire.");
	}
	
}