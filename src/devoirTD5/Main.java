package devoirTD5;
import java.util.Iterator;
import java.time.Year;

public class Main {
	 public static void main(String[] args) {
	/* Jeu de données de test. Lors de l'instanciation, les propriétés de chaque étudiant sont indiquées. 
	 * Par "défaut", les étudiants n'ont pas de note. La moyenne est ajoutée par la suite.
	 */
		 
	// Pour tester la vérification de la validité de la valeur pour "sexe"
	// Etudiant etudiant_test0 = new Etudiant("Dupont", "Julien", "O", 1129121, 0, 2022);
	Etudiant etudiant_test1 = new Etudiant("Dupont", "Julien", "M", 1129121, 0, 2021);
	Etudiant etudiant_test2 = new Etudiant("Durant", "Estelle", "F", 1139821, 0, 2022);
	Etudiant etudiant_test3 = new Etudiant("Ye", "Steve", "M", 9410912, 0, 2022);
	Etudiant etudiant_test4 = new Etudiant("Mimosa", "Steven", "M", 9910942, 0, 2022);
	
	// Test (nom du premier étudiant)
	//System.out.println(etudiant_test1.getNom());
	
	//Création de la promotion test puis on ajoute les étudiants
	Promotion promotion_test = new Promotion("test", Year.now().getValue()); // Année actuelle
	promotion_test.ajouter(etudiant_test1);
	promotion_test.ajouter(etudiant_test2);
	promotion_test.ajouter(etudiant_test3);
	promotion_test.ajouter(etudiant_test4);
	// Enlever un étudiant pour tester notre fonction
	promotion_test.enlever(etudiant_test4);
	
	/* L'année de la promotion doit correspondre entre l'étudiant et sa promotion actuelle 
	* (notamment en cas d'erreur de saisie)*/
	etudiant_test1.setAnnee_Promotion(promotion_test.getAnnee_Promotion());
	etudiant_test2.setAnnee_Promotion(promotion_test.getAnnee_Promotion());
	etudiant_test3.setAnnee_Promotion(promotion_test.getAnnee_Promotion());

	// Combien d'étudiants ? 
	promotion_test.compositionClasse(); // 3 étudiants, c'est correct
	// Nom puis année de la promotion
	promotion_test.afficherNom();
	System.out.println("L'année de cette promotion est " + promotion_test.getAnnee_Promotion() +".");
	
	// Affichage de la promotion avec les numéros des étudiants
	for (int index = 0; index < promotion_test.getEtudiantsList().size(); ++index) {
		System.out.println("La promotion comporte l'étudiant ayant pour numéro (identifiant) " +
				promotion_test.getEtudiantsList().get(index).getNumero() +".");
	}
	
	// Ajout des notes
	etudiant_test1.setNote_Moyenne(14);
	etudiant_test1.setNote_Moyenne(14);
	etudiant_test3.setNote_Moyenne(9);
	
	/* Qui passe en promotion supérieure parmi les élèves de la classe actuelle ?
	* Jusqu'à la fin de la liste, chercher si la note (moyenne) est suffisante
	* et afficher le résultat (passage ou non) */
	Iterator<Etudiant> i = promotion_test.getEtudiantsList().iterator();
    while (i.hasNext()) {
    	// Résultat
    	promotion_test.promotionAnneeSup(i.next());
    }
    // Supprimer certaines étudiants (ceux qui ont réussi) de la promotion actulle car ils passent en année supérieure
    promotion_test.getEtudiantsList().removeAll(promotion_test.toRemove);
    
    // Changer la couleur du texte pour montrer le résultat (après "mise à jour" des promotions)
    System.out.println(CouleursConsole.ROUGE);
    
    // Nombre d'étudiants qui restent (après traitement des moyennes)
	promotion_test.compositionClasse();

    // Vérification si l'année de promotion est bien correcte (après passage ou redoublement)
	System.out.println("\nL'étudiant " + etudiant_test1.getNomComplet() + " est donc dans la promotion suivante : "
			+ "\nAnnée : " + etudiant_test1.annee_promotion);
	System.out.println("\nL'étudiant " + etudiant_test2.getNomComplet() + " est donc dans la promotion suivante : "
			+ "\nAnnée : " + etudiant_test2.annee_promotion
			+ "\nNom de la promotion : " + promotion_test.getNom_promotion());
	
	// TEST - L'étudiant est-il bien dans la promotion qui correspond ? (contenu dans la liste de la promotion)
	if (promotion_test.getEtudiantsList().contains(etudiant_test3)){
	System.out.println("\nL'étudiant " + etudiant_test3.getNomComplet() + " est bien dans "
			+ "la promotion. L'objet etudiant_test 3 est bien \"inclus\" dans la liste des"
			+ " étudiants de cette promotion (" + 
			promotion_test.getNom_promotion() + " " + promotion_test.getAnnee_Promotion() 
			+ ")."); // cela fonctionne bien
	}
	 }
}
