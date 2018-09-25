package com.objis.cameroun.Systeme_Scolaire.service;
import java.util.Scanner;

import com.objis.cameroun.Systeme_Scolaire.domaine.Eleve; // ces instructions créent un lien entre la couche service et la couche domaine
import com.objis.cameroun.Systeme_Scolaire.domaine.Enseignant;

/**
 * @author Brandol
 *Cette classe contient tous les savoir-faire du programme
 */
public class Traitement {

	/**
	 * @param enseig
	 * Cette methode permet d'enregistrer un enseignant dans le systeme
	 */
	public void enregistrerEnseignant(Enseignant enseig) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("  Vous allez enregistrer un enseignant dans le systeme\n");
		
		//instructions permettant de recuperer les informations d'un enseignant entrées au clavier par l'utilisateur
		
		System.out.println("  Veillez saisir les coordonnees de l'enseignant:\n ");
		System.out.println("  Matricule: ");
		enseig.setMatricule(sc.nextLine());
		System.out.println("  Nom(s): ");
		enseig.setNom(sc.nextLine());
		System.out.println("  Prenom(s): ");
		enseig.setPrenom(sc.nextLine());
		System.out.println("  Sexe: ");
		enseig.setSexe(sc.nextLine());
		System.out.println("  Date de naissance( sous format: jour-Mois-Annee) : ");
		enseig.setDate_nais(sc.nextLine());
		System.out.println("  Nationalite: ");
		enseig.setNationalite(sc.nextLine());
		System.out.println("  Adresse( sous format: Quartier,Ville) : ");
		enseig.setAddresse(sc.nextLine());
		System.out.println("  Age: ");
		enseig.setAge(sc.nextInt());
		System.out.println("  Situation matrimoniale: ");
		enseig.setSituationMat(sc.nextLine());
		System.out.println("  Specialité: ");
		enseig.setSpecialite(sc.nextLine());
		System.out.println("  Grade: ");
		enseig.setGrade(sc.nextLine());
		System.out.println("  Email: ");
		enseig.setEmail(sc.nextLine());
		System.out.println("  Telephone: ");
		enseig.setTelephone(sc.nextLine());
		System.out.println("  Salaire: ");
		enseig.setSalaire(sc.nextDouble());
		
		// instructions pour afficher à l'ecran un message pour confirmé l'enregistrement de l'enseignant
		
		System.out.println("\n");
		System.out.println("L'enseignant "+ enseig.getNom()+ " "+ enseig.getPrenom()+ " a bien ete enregistre\n");
		
		
	}
	
	/**
	 * @param eleve
	 * Cette méthode permet d'enregistrer un eleve dans le systeme
	 */
	public void enregistrerEleve(Eleve eleve) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("  Vous allez enregistrer un eleve dans le systeme\n");
		
		//instructions permettant de recuperer les informations d'un enseignant entrées au clavier par l'utilisateur
		
				System.out.println("  Veillez saisir les coordonnees de l'eleve: \n");
				System.out.println("  Matricule: ");
				eleve.setMatricule(sc.nextLine());
				System.out.println("  Nom(s): ");
				eleve.setNom(sc.nextLine());
				System.out.println("  Prenom(s): ");
				eleve.setPrenom(sc.nextLine());
				System.out.println("  Sexe: ");
				eleve.setSexe(sc.nextLine());
				System.out.println("  Date de naissance( sous format: jour-Mois-Annee) : ");
				eleve.setDate_nais(sc.nextLine());
				System.out.println("  Nationalite: ");
				eleve.setNationalite(sc.nextLine());
				System.out.println("  Adresse( sous format: Quartier,Ville) : ");
				eleve.setAddresse(sc.nextLine());
				System.out.println("  Age: ");
				eleve.setAge(sc.nextInt());
				System.out.println("  Niveau d'etude: ");
				eleve.setNiveau(sc.nextLine());
				System.out.println("  Filiere: ");
				eleve.setFiliere(sc.nextLine());
				
				// message de confirmation de l'enregistrement
				System.out.println("\n");
				System.out.println("L'eleve "+ eleve.getNom()+ " "+ eleve.getPrenom()+ " a bien ete enregistre\n");
	}
	
	/**
	 * @param enseig
	 * cette methode permet d'afficher les details d'un enseignant apres son enregistrement
	 */
	public void afficherDetailsEnseignant(Enseignant enseig) {
		
		System.out.println("  Vous avez ci-dessous la fiche presentant les details de l'enseignant "+ enseig.getNom()+ " qui vient d'etre enregistre");
		System.out.println("\n");
		
		System.out.println("      -----------------------------------------------------------");
		System.out.println("      --                FICHE ENSEIGNANT                      ---");
		System.out.println("      -----------------------------------------------------------");
		System.out.println("                          ");
		System.out.println("             Matricule de l'enseignant :  " +  enseig.getMatricule());
		System.out.println("             Nom(s) de l'enseignant :  " +  enseig.getNom());
		System.out.println("             Prenom(s) de l'enseignant :  " +  enseig.getPrenom());
		System.out.println("             Sexe :  " +  enseig.getSexe());
		System.out.println("             Date de Naissance :  " +  enseig.getDate_nais());
		System.out.println("             Nationalite:  " +  enseig.getNationalite());
		System.out.println("             Age :  " +  enseig.getAge()+" ans ");
		System.out.println("             Situation Matrimoniale :  " +  enseig.getSituationMat() );
		System.out.println("             Specialite :  " +  enseig.getSpecialite());
		System.out.println("             Grade :  " +  enseig.getGrade());
		System.out.println("             Email :  " +  enseig.getEmail());
		System.out.println("             Adresse :  " +  enseig.getAddresse());
		System.out.println("             Telephone :  " +  enseig.getTelephone());
		System.out.println("             Son salaire est de :  " +  enseig.getSalaire()+ " FCFA \n");
		System.out.println("      -----------------------------------------------------------");
	 
	}
	
	/**
	 * @param elev
	 * Cette méthode permet d'afficher les details sur un eleve apres son enregistrement
	 */
	public void afficherDetailsEleve(Eleve elev) {
		
		System.out.println("  Vous avez ci-dessous la fiche presentant les details de l'eleve "+ elev.getNom() + " qui vient d'etre enregistre");
		System.out.println("\n");
		
		System.out.println("      -----------------------------------------------------------");
		System.out.println("      ---                FICHE ELEVE                          ---");
		System.out.println("      -----------------------------------------------------------");
		System.out.println("                          ");
		System.out.println("           Matricule de l'eleve :  " +  elev.getMatricule());
		System.out.println("           Nom(s) de l'eleve :  " +  elev.getNom());
		System.out.println("           Prenom(s) de l'eleve :  " +  elev.getPrenom());
		System.out.println("           Sexe :  " +  elev.getSexe());
		System.out.println("           Date de Naissance :  " +  elev.getDate_nais());
		System.out.println("           Nationalite :  " +  elev.getNationalite());
		System.out.println("           Age :  " +  elev.getAge()+" ans ");
		System.out.println("           Adresse :  " +  elev.getAddresse());
		System.out.println("           Niveau d'etude :  " +  elev.getNiveau());
		System.out.println("           Filiere :  " +  elev.getFiliere());
		System.out.println("      -----------------------------------------------------------");
		System.out.println("\n");
		
	}
}
