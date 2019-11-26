package fr.diginamic.openfoodfacts.service.comparator;

import java.util.Comparator;

import fr.diginamic.openfoodfacts.service.AllergeneCourant;

public class ComparateurCompteur implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1<o2){
			return 1;
		}else if (o1>02){
			return -1;
		}
		return 0;
	}

}
