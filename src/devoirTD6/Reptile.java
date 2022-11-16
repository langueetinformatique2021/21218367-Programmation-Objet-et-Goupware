package devoirTD6;

public abstract class Reptile extends Animal {
	protected boolean sang_froid = true ;
	private boolean presence_ecailles = true;
	
	public Reptile(String type) {
		super(type, 2); 
		super.manger();
		nage();
		marche();	
	}
public void présente() {
	super.présente();
	String etat1 = (sang_froid) ? "à sang froid " : "à sang chaud ";
	String etat2 = (presence_ecailles) ? "avec écailles" : "sans écaille";
	System.out.println("je suis un animal " + etat1 + etat2 +".");
	System.out.println("j'appartiens à la famille des reptiles.");
}
public void nage () {
	System.out.println("je peux nager");
}
public void marche () {
	System.out.println("je peux marcher");
}
}