package fr.diginamic.openfoodfacts.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.diginamic.openfoodfacts.entites.Allergene;
import fr.diginamic.openfoodfacts.entites.Produit;

public class ParseurAllergenes {

	public static void ajoutAllergene(String allergenes, Stock stock){
		String[] morceau = allergenes.split(",");
		Map<Produit, String> mapAllergene = new HashMap<>();
		List<Produit> produits = stock.getProduits();
		for (Produit produit:produits){
				for (int i = 0; i< morceau.length; i++){
			mapAllergene.put(produit, morceau[i]);
		}
		}
	}

}
