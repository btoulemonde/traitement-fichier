package fr.diginamic.openfoodfacts.utils;

import java.util.Scanner;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stock stock = LectureDonnees.lire("C:/work/open-food-facts");
		
		
		
		System.out.println("1: Rechercher les meilleurs produits pour une Marque donnée ");
		System.out.println("2: Rechercher les meilleurs produits pour une Catégorie donnée");
		System.out.println("3: Rechercher les meilleurs produits par Marque et par Catégorie ");
		System.out.println("4: Afficher les allergènes les plus courants avec le nb de produits dans lesquels ils apparaissent ");
		System.out.println("5: Afficher les additifs les plus courants avec le nb de produits dans lesquels ils apparaissent");

		String choixUser = scanner.next();
		int choix = Integer.parseInt(choixUser);
		
		switch(choix){
		case 1:
			break;
		case 2: 
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
	}

}
