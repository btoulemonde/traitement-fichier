package fr.diginamic.openfoodfacts.entites;

import java.util.ArrayList;
import java.util.List;

public class Produit {
	
	/**
	 * 
	 */
	private Categorie categorie;
	/**
	 * @param categorie
	 * @param marque
	 * @param scoreNutritionnel
	 * @param energie100g
	 * @param graisse100g
	 * @param graisseSaturee100g
	 * @param hydratesCarbones100g
	 * @param sucres100g
	 * @param fibres100g
	 * @param proteines100g
	 * @param sel100g
	 * @param vitA100g
	 * @param vitD100g
	 * @param vitE100g
	 * @param vitK100g
	 * @param vitC100g
	 * @param vitB1100g
	 * @param vitB2100g
	 * @param vitPP100g
	 * @param vitB6100g
	 * @param vitB9100g
	 * @param vitB12100g
	 * @param calcium100g
	 * @param magnesium100g
	 * @param fer100g
	 * @param betaCarotene100g
	 * @param presenceHuilePalme
	 * @param pourcentageFruitsLegumes100g
	 * @param ingredients
	 * @param additifs
	 * @param allergenes
	 */
	public Produit(Categorie categorie, Marque marque, String scoreNutritionnel, double energie100g, double graisse100g,
			double graisseSaturee100g, double hydratesCarbones100g, double sucres100g, double fibres100g,
			double proteines100g, double sel100g, double vitA100g, double vitD100g, double vitE100g, double vitK100g,
			double vitC100g, double vitB1100g, double vitB2100g, double vitPP100g, double vitB6100g, double vitB9100g,
			double vitB12100g, double calcium100g, double magnesium100g, double fer100g, double betaCarotene100g,
			boolean presenceHuilePalme, double pourcentageFruitsLegumes100g, List<Ingredient> ingredients,
			List<Additif> additifs, List<Allergene> allergenes) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.scoreNutritionnel = scoreNutritionnel;
		this.energie100g = energie100g;
		this.graisse100g = graisse100g;
		this.graisseSaturee100g = graisseSaturee100g;
		this.hydratesCarbones100g = hydratesCarbones100g;
		this.sucres100g = sucres100g;
		this.fibres100g = fibres100g;
		this.proteines100g = proteines100g;
		this.sel100g = sel100g;
		this.vitA100g = vitA100g;
		this.vitD100g = vitD100g;
		this.vitE100g = vitE100g;
		this.vitK100g = vitK100g;
		this.vitC100g = vitC100g;
		this.vitB1100g = vitB1100g;
		this.vitB2100g = vitB2100g;
		this.vitPP100g = vitPP100g;
		this.vitB6100g = vitB6100g;
		this.vitB9100g = vitB9100g;
		this.vitB12100g = vitB12100g;
		this.calcium100g = calcium100g;
		this.magnesium100g = magnesium100g;
		this.fer100g = fer100g;
		this.betaCarotene100g = betaCarotene100g;
		this.presenceHuilePalme = presenceHuilePalme;
		this.pourcentageFruitsLegumes100g = pourcentageFruitsLegumes100g;
		this.ingredients = ingredients;
		this.additifs = additifs;
		this.allergenes = allergenes;
	}

	private Marque marque;
	private String scoreNutritionnel;
	
	private double energie100g;
	private double graisse100g;
	private double graisseSaturee100g;
	private double hydratesCarbones100g;
	private double sucres100g;
	private double fibres100g;
	private double proteines100g;
	private double sel100g;
	private double vitA100g;
	private double vitD100g;
	private double vitE100g;
	private double vitK100g;
	private double vitC100g;
	private double vitB1100g;
	private double vitB2100g;
	private double vitPP100g;
	private double vitB6100g;
	private double vitB9100g;
	private double vitB12100g;
	private double calcium100g;
	private double magnesium100g;
	private double fer100g;
	private double betaCarotene100g;
	private boolean presenceHuilePalme;
	private double pourcentageFruitsLegumes100g;
	
	
	
	List<Ingredient> ingredients = new ArrayList<>();
	
	List<Additif> additifs = new ArrayList<>();
	
	List<Allergene> allergenes = new ArrayList<>();

}
