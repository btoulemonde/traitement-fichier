package fr.diginamic.openfoodfacts.utils;
import java.util.ArrayList;

import java.util.List;

import fr.diginamic.openfoodfacts.entites.Produit;

public class Stock {
	private List<Produit> produits = new ArrayList<>();

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
