package fr.diginamic.openfoodfacts.service.comparator;

import java.util.Comparator;

import fr.diginamic.openfoodfacts.entites.Compteur;


public class ComparateurCompteur implements Comparator<Compteur>{

	@Override
	public int compare(Compteur o1, Compteur o2) {
		if (o1.getVal()<o2.getVal()){
			return 1;
		}else if (o1.getVal()>o2.getVal()){
			return -1;
		}
		return 0;
	}


}
