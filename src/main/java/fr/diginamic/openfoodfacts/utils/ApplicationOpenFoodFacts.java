package fr.diginamic.openfoodfacts.utils;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.openfoodfacts.entites.Produit;
import fr.diginamic.openfoodfacts.service.MeilleurProduitCategorie;
import fr.diginamic.openfoodfacts.service.MeilleurProduitMarque;
import fr.diginamic.openfoodfacts.service.MeilleurProduitMarqueCategorie;
import fr.diginamic.openfoodfacts.service.exception.Except;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stock stock = LectureDonnees.lire("C:/work/open-food-facts.csv");
		
		
		
			
		
		
		System.out.println("----MENU----\n");
		System.out.println("1: Rechercher les meilleurs produits pour une Marque donnée ");
		System.out.println("2: Rechercher les meilleurs produits pour une Catégorie donnée");
		System.out.println("3: Rechercher les meilleurs produits par Marque et par Catégorie ");
		System.out.println("4: Afficher les allergènes les plus courants avec le nb de produits dans lesquels ils apparaissent ");
		System.out.println("5: Afficher les additifs les plus courants avec le nb de produits dans lesquels ils apparaissent");

		String choixUser = scanner.next();
		int choix = Integer.parseInt(choixUser);
		
		switch(choix){
		case 1:
			MeilleurProduitMarque meilleurProduitMarque = new MeilleurProduitMarque();
			try {
				meilleurProduitMarque.traiter(stock, scanner);
			} catch (Except e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2: 
			MeilleurProduitCategorie meilleurProduitCategorie = new MeilleurProduitCategorie();
			try {
				meilleurProduitCategorie.traiter(stock, scanner);
			} catch (Except e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			MeilleurProduitMarqueCategorie meilleurProduitMarqueCategorie = new MeilleurProduitMarqueCategorie();
			try {
				meilleurProduitMarqueCategorie.traiter(scanner, stock);
			} catch (Except e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			break;
		case 5:
			break;
		}
		
	
	}

}
