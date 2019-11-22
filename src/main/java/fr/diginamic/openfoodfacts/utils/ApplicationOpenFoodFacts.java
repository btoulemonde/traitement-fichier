package fr.diginamic.openfoodfacts.utils;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) {
		
		Inventaire inventaire = LectureDonnees.lire("C:/work/open-food-facts");
		
		
		
		System.out.println("1: Rechercher les meilleurs produits pour une Marque donnée ");
		System.out.println("2: Rechercher les meilleurs produits pour une Catégorie donnée");
		System.out.println("3: Rechercher les meilleurs produits par Marque et par Catégorie ");
		System.out.println("4: Afficher les allergènes les plus courants avec le nb de produits dans lesquels ils apparaissent ");
		System.out.println("5: Afficher les additifs les plus courants avec le nb de produits dans lesquels ils apparaissent");

	}

}
