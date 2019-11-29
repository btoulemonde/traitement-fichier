package fr.diginamic.openfoodfacts.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.openfoodfacts.entites.Compteur;
import fr.diginamic.openfoodfacts.service.comparator.ComparateurCompteur;
import fr.diginamic.openfoodfacts.utils.Stock;

public class AdditifCourant {
	public void traiter(Stock stock) {

		String additifs = stock.getAdditifs().toString();
		List<String> listeAdditifs = new ArrayList<>();

		additifs = additifs.replace("[", "");
		additifs = additifs.replace("]", "");
		additifs = additifs.replace("fr:", "");
		additifs = additifs.replace("_", "");
		additifs = additifs.replace(":", "");
		additifs = additifs.replace("*", "");

		String[] split = additifs.split(",");

		for (int i = 0; i < split.length; i++) {
			listeAdditifs.add(split[i]);
		}

		// compteur
		System.out.println("Les allergènes les plus courants sont :");
		HashMap<String, Compteur> mapCompteurs = new HashMap<>();
		for (String a : listeAdditifs) {
			Compteur compteur = mapCompteurs.get(a);

			if (compteur == null) {
				compteur = new Compteur(a);
				mapCompteurs.put(a, compteur);
			}
			compteur.setVal(compteur.getVal() + 1);
		}
		ArrayList<Compteur> listeAdd = new ArrayList<>();
		listeAdd.addAll(mapCompteurs.values());

		Collections.sort(listeAdd, new ComparateurCompteur());
		for(int i =1; i<11; i++){
		System.out.println(listeAdd.get(i));
		}
	}


}
