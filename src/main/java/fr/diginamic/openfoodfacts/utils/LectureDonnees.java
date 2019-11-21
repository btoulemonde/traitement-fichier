package fr.diginamic.openfoodfacts.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureDonnees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String filePath = ClassLoader.getSystemClassLoader().getResource("open-food-facts.csv").getFile();

			File file = new File(filePath);
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			for (String ligne : lignes) {
				System.out.println(ligne);
				
			}
			
			// On supprime la ligne d'entéte avec les noms des colonnes
			lignes.remove(0);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
