package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

public class Produit {
	
	/**
	 * 
	 */
	private Categorie categorie;
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
