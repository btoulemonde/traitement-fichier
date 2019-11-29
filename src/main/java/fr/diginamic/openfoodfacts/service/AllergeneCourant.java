package fr.diginamic.openfoodfacts.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import fr.diginamic.openfoodfacts.entites.Compteur;
import fr.diginamic.openfoodfacts.service.comparator.ComparateurCompteur;
import fr.diginamic.openfoodfacts.utils.Stock;

public class AllergeneCourant {

	public void traiter(Stock stock) {

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
			listeAllergenes.add(split[i]);
		}

		// compteur
		System.out.println("Les additifs les plus courants sont :");
		HashMap<String, Compteur> mapCompteurs = new HashMap<>();
		for (String a : listeAllergenes) {
			Compteur compteur = mapCompteurs.get(a);

			if (compteur == null) {
				compteur = new Compteur(a);
				mapCompteurs.put(a, compteur);
			}
			compteur.setVal(compteur.getVal() + 1);
		}
		ArrayList<Compteur> listeAll = new ArrayList<>();
		listeAll.addAll(mapCompteurs.values());

		Collections.sort(listeAll, new ComparateurCompteur());
		for(int i =1; i<11; i++){
		System.out.println(listeAll.get(i));
		}
	}

}