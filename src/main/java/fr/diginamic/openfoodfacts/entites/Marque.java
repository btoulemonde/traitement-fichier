package fr.diginamic.openfoodfacts.entites;

public class Marque {
	private String nom;

	/**
	 * @param nom
	 */
	public Marque(String nom) {
		super();
		this.nom = nom;
		
		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
