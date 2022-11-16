package devoirTD6;

public abstract class Animal {
	private String espece;
	private int nb_oreilles = 2;

public Animal(String espece, int nb_oreilles) {
	this.espece = espece;
	this.nb_oreilles = nb_oreilles;
}
public void présente() {
	System.out.println("je suis un représentant de l'espèce des " + espece + " et j'ai " + nb_oreilles + " oreilles");
}
public void manger() {
	System.out.println("j'aime bien manger");
}
}
