package devoirTD5;

public class Etudiant { 
	
	private final String nom;
	private final String prenom;
	private final String sexe;
	private final int numero_etudiant;
	private double note_moyenne; // Moyenne annuelle de l'étudiant
	public int annee_promotion; // Année de promotion d'appartenance (public pour pouvoir y accéder directement)
	
	/*
	 * Constructeur
	 */
	public Etudiant(String nom, String prenom, String sexe, int numero_etudiant, double note_moyenne, int annee_promotion) {
        if (sexe.equals("M") || sexe.equals("F")) {
			this.nom = nom;
			this.prenom = prenom;
			this.sexe = sexe;
			this.numero_etudiant = numero_etudiant;
			this.note_moyenne = note_moyenne;
			this.annee_promotion = annee_promotion;
        }
        else {
        	 throw new IllegalArgumentException("Le sexe doit être saisi (2 options uniquement) : Masculin ou Féminin");
        }
	}
	
	// Accesseurs (getters)
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public String getNomComplet() {
		return prenom + " " + nom ;
	}

	public String getSexe() {
		return sexe;
	}

	public int getNumero() {
		return numero_etudiant;
	}

	public double getNote_Moyenne() {
		return note_moyenne;
	}

	// Setters
	
	// Setter pour définir manuellement la moyenne
	public void setNote_Moyenne(int note_moyenne) {
		this.note_moyenne = note_moyenne;
	}

	// Même principe pour l'année
	public void setAnnee_Promotion(int annee_promotion) {
		this.annee_promotion = annee_promotion;	
	}
	
}
