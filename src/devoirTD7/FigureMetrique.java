package devoirTD7;

public abstract class FigureMetrique {
	//création et gestion d'une figure géométrique, par défaut en noir
    protected String couleur = "noir";
    
    // lors de la création d'une nouvelle instance de la classe FigureGeometrique
    // constructeur
    public FigureMetrique (String color) {
		couleur = color; // associer la couleur lors de l'instanciation
    }

    // récupérer la couleur de la figure
    public String getCouleur() {
    	return this.couleur;
    }
	// calcul du périmètre d'une figure géométrique
	protected abstract double perimetre();

	// calcul de la surface d'une figure géométrique
	public abstract double surface();
	} // fin de définition de la classe

