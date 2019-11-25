package fr.diginamic.openfoodfacts.utils;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.openfoodfacts.entites.Additif;
import fr.diginamic.openfoodfacts.entites.Allergene;
import fr.diginamic.openfoodfacts.entites.Categorie;
import fr.diginamic.openfoodfacts.entites.Ingredient;
import fr.diginamic.openfoodfacts.entites.Marque;
import fr.diginamic.openfoodfacts.entites.Produit;

public class ParseurProduits {
	
	public static void ajoutLigne(Stock stock, String ligne){
		
		//découpage des lignes
		String[] morceau = ligne.split("\\|");
		String categories = morceau[2];
		String marques = morceau[3];
		String scoreNutritionnel = morceau[1];
		String nom = morceau[0];
		String ingredients = morceau[4];
		
		String additifs = morceau[31];
		String allergenes = morceau [30];
		
		Ingredient ingredient = new Ingredient(ingredients);
		Categorie categorie = new Categorie(categories);
		Marque marque = new Marque(marques);
		Additif additif = new Additif(additifs);
		Allergene allergene = new Allergene(allergenes);
		
		
		
		Produit produit = new Produit(nom, categorie, marque, scoreNutritionnel);
		
		stock.getProduits().add(produit);
		
		
	}
	
	

}
