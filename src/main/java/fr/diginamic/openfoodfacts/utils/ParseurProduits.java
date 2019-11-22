package fr.diginamic.openfoodfacts.utils;

public class ParseurProduits {
	
	public static void ajoutLigne(Stock inventaire, String ligne){
		
		//découpage des lignes
		String[] morceau = ligne.split("|");
		String nomProduit = morceau[0];
		String grade = morceau[1];
		String categorie = morceau[2];
		String marque = morceau[3];
		String ingredients = morceau [4];
		
		String allergenes = morceau [30];
		String additifs = morceau[31];
		
		
		
		
	}
	
	

}
