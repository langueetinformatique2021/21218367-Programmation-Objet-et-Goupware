package devoirTD7;

public class Cercle extends FigureMetrique implements Comparable<Cercle> {
	private double rayon;

	public Cercle(String co, double ra) {
		super(co);
		rayon = ra;
	}

	public double getRayon() {
		return rayon;
	}

	public double perimetre() {
		double perimetre = 2 * rayon * Math.PI;
		return perimetre;
	}

	@Override
	public double surface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}

	@Override
	public int compareTo(Cercle deuxiemeCircle) {
		return (int) (this.perimetre() - deuxiemeCircle.perimetre());
	}

	public void afficher() {

		System.out.println("Couleur : " + this.getCouleur());
		System.out.println("Rayon : " + this.getRayon());
		System.out.println("Périmètre : " + this.perimetre());
		System.out.println("Surface : " + this.surface());

	}

	public void compare(Cercle b) {

		if (this.compareTo(b) > 0)
			System.out.println("Le premier cercle est plus grand que le deuxième circle.");
		else if (this.compareTo(b) < 0)
			System.out.println("Le deuxième cercle est plus grand que le premier.");
		else
			System.out.println("Le premier cercle et le deuxième circle ont la même taille.");

	}

}
