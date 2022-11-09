package devoirTD5;
import java.util.ArrayList;
import java.util.List;

public class Promotion {
	
 	private String nom_promotion;
 	private final int annee_promotion;
	
 	// Liste des étudiants
	private List<Etudiant> etudiantsList = new ArrayList<>();
	
	List<Etudiant> toRemove = new ArrayList<>();
	
	// Constructeur
	public Promotion(String nom_promotion, int annee_promotion) {
		this.nom_promotion = nom_promotion;
		this.annee_promotion = annee_promotion;
	}

	// Ajout et suppression dans la liste
	public void ajouter(Etudiant etudiant) {
		etudiantsList.add(etudiant);
		System.out.println("L'étudiant " + etudiant.getNomComplet() + " a été ajouté à la promotion.");
	}

	public void enlever(Etudiant etudiant) {
		etudiantsList.remove(etudiant);
		System.out.println("L'étudiant " + etudiant.getNomComplet() + " a quitté la promotion.");
	}

	// Obtenir le nombre d'étudiants
	public void compositionClasse() {
		int count = 0;
		while (count < etudiantsList.size()) {
			count += 1;
		}
		System.out.println("La promotion comporte " + count + " étudiants.");
	}
	
	// L'étudiant a-t-il une moyenne suffisante ? Si oui, on le passe en année supérieure
	public void promotionAnneeSup(Etudiant etudiant) {
		if (etudiant.getNote_Moyenne() >= 10) {
			etudiant.annee_promotion += 1; // Simplification de => etudiant.annee_promotion = etudiant.annee_promotion + 1;
			System.out.println("L'étudiant " + etudiant.getNomComplet() + " vient de passer en année supérieure. "
					+ "Il sera dans la promotion " + etudiant.annee_promotion);
			/* Marquer l'étudiant à supprimer (car il a réussi et passe en année supérieure)
			* pour qu'il soit supprimé de la promotion actuelle (après le passage de l'itérateur dans Main)*/
			toRemove.add(etudiant);	
		}
		else {
			System.out.println("L'étudiant " + etudiant.getNomComplet() + " redouble (reste dans la même promotion).");
		}
		}

	// Pour accéder à chaque élément (nom de la promotion et liste des étudiants)
	public String getNom_promotion() {
		return nom_promotion;
	}
	
	// Obtenir la liste des étudiants de la promotion
	public List<Etudiant> getEtudiantsList() {
		return etudiantsList;
	}
	
	// Récupérer et afficher le nom (string) de la promotion
	public void afficherNom() {
		System.out.println("Le promotion s'appelle " + this.nom_promotion + ".");
		
	}
	
	/* Accesseur (getter)
	* Retourne l'année de la promotion */
	public int getAnnee_Promotion() {
		return annee_promotion;
	}

	}