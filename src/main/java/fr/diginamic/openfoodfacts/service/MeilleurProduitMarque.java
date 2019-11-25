package fr.diginamic.openfoodfacts.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.openfoodfacts.entites.Produit;
import fr.diginamic.openfoodfacts.service.comparator.ComparateurAlpha;
import fr.diginamic.openfoodfacts.service.exception.Except;
import fr.diginamic.openfoodfacts.utils.Stock;

public class MeilleurProduitMarque {
	Scanner scanner = new Scanner(System.in);

	public void traiter(Stock stock, Scanner scanner) throws Except {

		System.out.println("veuillez saisir une marque: ");
		String choix = scanner.next();

		List<Produit> produits = stock.getProduits();
		List<Produit> choixUser = new ArrayList<>();

		for (Produit produit : produits) {
			
			if (produit.getMarque().getNom().equalsIgnoreCase(choix)) {
				choixUser.add(produit);
			}
		}
		Collections.sort(choixUser, new ComparateurAlpha());
		if (choixUser.size() > 0) {

			for (Produit produit : choixUser) {
				System.out.println(
						"produit: " + produit.getNom() + " --> score nutritionnel : " + produit.getScoreNutritionnel());
			}
		}else{
			throw new Except("la marque saisie n'est pas valide");

		}

	}

}
