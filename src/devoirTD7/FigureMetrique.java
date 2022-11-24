package devoirTD7;

public abstract class FigureMetrique {
	//création et gestion d'une figure géométrique*/
    protected String couleur = "noir";
    
    // création d'une nouvelle instance de la classe FigureGeometrique
    // constructeur
    public FigureMetrique (String co) {
        couleur = co; // couleur par défaut
    }

	// calcul du périmètre d'une figure géométrique
    public String getCouleur() {
    	return this.couleur;
    }
	public abstract double perimetre();

	// calcul de la surface d'une figure géométrique
	
	public abstract double surface();
	} // fin de définition de la classe

