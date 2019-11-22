package fr.diginamic.openfoodfacts.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class LectureDonnees {

public static Stock lire(String cheminFichier){
	Stock stock = new Stock();
	
	List<String> lignes =new ArrayList<>();
	
	try{
		File file = new File(cheminFichier);
		lignes = FileUtils.readLines(file, "UTF-8");
		
		lignes.remove(0);
		
		for (String ligne:lignes){
			ParseurProduits.ajoutLigne(stock, ligne);
		}
		return stock;
		
		}catch (IOException e){
			System.out.println(e.getMessage());
			return null;
		}
		
	}


		
			

			
			
}
