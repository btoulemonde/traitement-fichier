package fr.diginamic.openfoodfacts.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.openfoodfacts.entites.Produit;
import fr.diginamic.openfoodfacts.service.comparator.ComparateurAlpha;
import fr.diginamic.openfoodfacts.service.exception.Except;
import fr.diginamic.openfoodfacts.utils.Stock;

public class MeilleurProduitMarqueCategorie {
	
	Scanner scanner = new Scanner(System.in);
	public void traiter(Scanner scanner, Stock stock) throws Except{
		
		
		List <Produit> produits = stock.getProduits();
		List<Produit> choixUser = new ArrayList<Produit>();
		
		System.out.println("Veuillez choisir une marque: ");
		String choixMarque = scanner.nextLine();
		
		System.out.println("Veuillez choisir une catégorie de produit: ");
		String choixCategorie = scanner.nextLine();
		
		for(Produit produit : produits){
			if(produit.getMarque().getNom().equalsIgnoreCase(choixMarque) && produit.getCategorie().getLibelle().equalsIgnoreCase(choixCategorie)){
				choixUser.add(produit);
				
			}
		}
		Collections.sort(choixUser, new ComparateurAlpha());
		if(choixUser.size()>0){
		for (Produit produit:produits){
			System.out.println("produit: " + produit.getNom() + " --> score nutritionnel : " + produit.getScoreNutritionnel());
		}
		}else{
			throw new Except("les saisies sont invalide");
		}
	}
}
