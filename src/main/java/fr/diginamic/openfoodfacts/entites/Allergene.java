package fr.diginamic.openfoodfacts.entites;

public class Allergene {
	
	private String libelle;

	/**
	 * @param libelle
	 */
	public Allergene(String libelle) {
		super();
		this.libelle = libelle;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
