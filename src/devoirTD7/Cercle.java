package devoirTD7;

public class Cercle extends FigureMetrique implements Comparable<Cercle>{
	private double rayon;
	public Cercle(String co, double ra) {
		super(co);
		this.rayon = ra ;
	}
	public double getRayon() {
		return this.rayon;
	}
	public double perimetre() {
		double perimetre =  2* rayon*Math.PI;
		return perimetre;
	}
	@Override
	public double surface() {
		double surface =Math.PI*rayon*rayon;
		return surface;
	}
	@Override
    public int compareTo(Cercle deuxiemeCircle) {
    	return (int) (this.perimetre()-deuxiemeCircle.perimetre());
    }

	public void afficher() {
	
		System.out.println("Color : "+this.getCouleur());
		System.out.println("Rayon : "+this.getRayon());
		System.out.println("Perimetre : "+this.perimetre());
		System.out.println("Suface : "+this.surface());
		
	}

  
	public void compare(Cercle p2) {
		
		if (this.compareTo(p2) > 0) 
			System.out.println("Le premier circle est plus grand que le deuxième circle");
		else  if  (this.compareTo(p2) < 0) 
			System.out.println( "Le deuxieme circle est le plus grand que le premier "); 
		else System.out.println( "Le premier circle et le deuxième circle ont la même taille");
		
	}

}
