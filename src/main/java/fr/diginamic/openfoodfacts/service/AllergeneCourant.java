package fr.diginamic.openfoodfacts.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import fr.diginamic.openfoodfacts.entites.Allergene;
import fr.diginamic.openfoodfacts.entites.Produit;
import fr.diginamic.openfoodfacts.utils.Stock;

public class AllergeneCourant {

	public void traiter(Stock stock) {

		List<Produit> produits = stock.getProduits();
		String allergenes = stock.getAllergenes().toString();
		List<String> listeAllergenes = new ArrayList<>();

    	allergenes = allergenes.replace("[", "");
		allergenes = allergenes.replace("]", "");
		allergenes = allergenes.replace("fr:", "");
		allergenes = allergenes.replace("_", "");
		allergenes = allergenes.replace(":", "");
		allergenes = allergenes.replace("*", "");

		String[] split = allergenes.split(",");

		for (int i = 0; i < split.length; i++) {
				listeAllergenes.add(split[i].toLowerCase());
			}
		// compteur
		HashMap<String, Integer> compteurs = new HashMap<>();

		for (int i = 0; i < listeAllergenes.size(); i++) {
			String allergene = listeAllergenes.get(i);
			Integer compteur = compteurs.get(allergene);

			if (compteur == null) {
				compteur = 0;
			}
			compteur++;

			compteurs.put(allergene, compteur);
		}
		Set<String> allergene = compteurs.keySet();

		Iterator<String> iterateur = allergene.iterator();
		while (iterateur.hasNext()) {
			String all = iterateur.next();
			Integer compteur = compteurs.get(all);
			System.out.println("allergene: " + all + " nb: " + compteur);
		}

	}
}