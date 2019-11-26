package fr.diginamic.openfoodfacts.utils;
import java.util.ArrayList;

import java.util.List;

import fr.diginamic.openfoodfacts.entites.Allergene;
import fr.diginamic.openfoodfacts.entites.Produit;

public class Stock {
	private List<Produit> produits = new ArrayList<>();
	private List<String> allergenes = new ArrayList<>();
	

	/**
	 * @return the allergenes
	 */
	public List<String> getAllergenes() {
		return allergenes;
	}

	/**
	 * @param allergenes the allergenes to set
	 */
	public void setAllergenes(List<String> allergenes) {
		this.allergenes = allergenes;
	}

	/**
	 * @return the produits
	 */
	public List<Produit> getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}



	

}
