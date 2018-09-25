package com.objis.cameroun.Systeme_Scolaire.domaine;

/**
 * @author Brandol
 *cette classe contient les informations d'une Personne
 *C'est la classe parente des classes Enseignants et Eleve
 *Elle contient egalement les constructeurs, les getters/setters aux attributs d'une Personne
 */
public class Personne {
	
	// voici les propri�t�s d'une personne 
	protected String matricule;
	protected String nom;
	protected String prenom;
	protected String sexe;
	protected String date_nais;
	protected String nationalite;
	protected String addresse;
	protected int age;
	
	// voici les constructeurs
	// Ce constructeur ne prend rien en parametre
	
	public Personne() {
		//super();
	}

	// Ce Constructeur prend en param�tres toutes les prori�t�s d'une personne
	public Personne(String matricule, String nom, String prenom, String sexe, String date_nais, String nationalite,
			String addresse, int age) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.date_nais = date_nais;
		this.nationalite = nationalite;
		this.addresse = addresse;
		this.age = age;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDate_nais() {
		return date_nais;
	}

	public void setDate_nais(String date_nais) {
		this.date_nais = date_nais;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
