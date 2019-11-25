package fr.diginamic.openfoodfacts.service.comparator;

import java.util.Comparator;

import fr.diginamic.openfoodfacts.entites.Produit;

public class ComparateurAlpha implements Comparator<Produit>{

	@Override
	public int compare(Produit p1, Produit p2) {
		return p1.getScoreNutritionnel().compareTo(p2.getScoreNutritionnel());
	}

}
