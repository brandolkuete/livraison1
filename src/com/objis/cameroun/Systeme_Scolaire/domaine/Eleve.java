package com.objis.cameroun.Systeme_Scolaire.domaine;

/**
 * @author Brandol
 * Cette classe contient les propri�t�s et les savoir-faire d'un �l�ve
 *la classe Eleve h�rite de la classe Personne
 */
public class Eleve extends Personne {
	
	private String niveau;
	private String filiere;
	
	
	/**
	 * ceci est le constructeur qui ne prend rien en parametre
	 */
	public Eleve() {
		super();
	}


	/**
	 * @param niveau
	 * @param filiere
	 * Ce constructeur prend en parametre toutes les propri�t�s d'un �l�ve
	 */
	public Eleve(String niveau, String filiere) {
		super();
		this.niveau = niveau;
		this.filiere = filiere;
	}

// voici les accesseurs aux proprietes d'un �l�ve
	
	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	public String getFiliere() {
		return filiere;
	}


	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}


	@Override
	public String toString() {
		return "Eleve [niveau=" + niveau + ", filiere=" + filiere + "]";
	}
	
	

}
